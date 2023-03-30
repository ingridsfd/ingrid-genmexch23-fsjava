package Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numeroMesa;
    private List<Plato> platos;
    private Usuario mesero;

    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.platos = new ArrayList<>();
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
    

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void eliminarPlato(Plato plato) {
        platos.remove(plato);
    }

    public void mostrarPlatos() {
        System.out.println("Platos de la mesa " + numeroMesa + ":");
        for (Plato plato : platos) {
            System.out.println(plato.getNombre() + " - " + plato.getPrecio());
        }
    }

    public Plato getPlato(String nombrePlato) {
        for (Plato plato : platos) {
            if (plato.getNombre().equals(nombrePlato)) {
                return plato;
            }
        }
        System.out.println("El plato " + nombrePlato + " no se encuentra en esta mesa.");
        return null;
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0.0;
        for (Plato plato : platos) {
            precioTotal += plato.getPrecio();
        }
        return precioTotal;
    }

    public void pagar() {
        if (!platos.isEmpty()) {
            double total = calcularPrecioTotal();
            System.out.println("El total a pagar es: $" + total);
            platos.clear();
        } else {
            System.out.println("La mesa no tiene pedidos para pagar");
        }
    }

    
    
    public void vaciarMesa() {
        platos.clear();
    }

	public boolean estaOcupada() {
	    return !platos.isEmpty();	
	}

	public void setMesero(Usuario usuario) {
	    this.mesero = usuario;
	}


	public Usuario getMesero() {
	    return this.mesero;
	}

	}

