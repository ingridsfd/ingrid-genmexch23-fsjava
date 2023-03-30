package Restaurante;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private Cliente cliente;
    private Mesa mesa;
    private ArrayList<Plato> platos;
    private boolean pagado;
    
    public Pedido(int id, Cliente cliente, Mesa mesa) {
        this.id = id;
        this.cliente = cliente;
        this.mesa = mesa;
        this.platos = new ArrayList<>();
        this.pagado = false;
    }
    
    public int getId() {
        return this.id;
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Mesa getMesa() {
        return this.mesa;
    }
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    public ArrayList<Plato> getPlatos() {
        return this.platos;
    }
    
    public boolean isPagado() {
        return this.pagado;
    }
    
    public void agregarPlato(Plato plato) {
        this.platos.add(plato);
    }
    
    public void eliminarPlato(Plato plato) {
        this.platos.remove(plato);
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Plato plato : this.platos) {
            total += plato.getPrecio();
        }
        return total;
    }
    
    public void pagar() {
        this.pagado = true;
    }
}
