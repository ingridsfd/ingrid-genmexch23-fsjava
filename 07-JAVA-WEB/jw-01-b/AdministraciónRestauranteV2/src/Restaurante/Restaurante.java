package Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
private List<Usuario> usuarios;
private List<Mesa> mesas;
private List<Plato> platos;

public Restaurante() {
    usuarios = new ArrayList<>();
    mesas = new ArrayList<>();
    platos = new ArrayList<>();
}

public void agregarUsuario(Usuario usuario) {
    usuarios.add(usuario);
}

public Usuario getUsuario(String username) {
    for (Usuario usuario : usuarios) {
        if (usuario.getUsername().equals(username)) {
            return usuario;
        }
    }
    return null;
}

public void agregarMesa(Mesa mesa) {
    mesas.add(mesa);
}

public Mesa getMesa(int numeroMesa) {
    for (Mesa mesa : mesas) {
        if (mesa.getNumeroMesa() == numeroMesa) {
            return mesa;
        }
    }
    return null;
}

public void agregarPlato(Plato plato) {
    platos.add(plato);
}

public Plato getPlato(String nombrePlato) {
    for (Plato plato : platos) {
        if (plato.getNombre().equals(nombrePlato)) {
            return plato;
        }
    }
    return null;
}

public List<Mesa> getMesasDisponibles() {
    List<Mesa> mesasDisponibles = new ArrayList<>();
    for (Mesa mesa : mesas) {
        if (!mesa.estaOcupada()) {
            mesasDisponibles.add(mesa);
        }
    }
    return mesasDisponibles;
}

public List<Mesa> getMesasOcupadas() {
    List<Mesa> mesasOcupadas = new ArrayList<>();
    for (Mesa mesa : mesas) {
        if (mesa.estaOcupada()) {
            mesasOcupadas.add(mesa);
        }
    }
    return mesasOcupadas;
}
}
