package Restaurante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Scanner scanner = new Scanner(System.in);

        // Agregamos usuarios
        restaurante.agregarUsuario(new Usuario("admin", "admin123", "admin"));
        restaurante.agregarUsuario(new Usuario("mesero1", "mesero123", "mesero"));
        restaurante.agregarUsuario(new Usuario("mesero2", "mesero123", "mesero"));

        // Creamos mesas y asignamos meseros
        Mesa mesa1 = new Mesa(1);
        mesa1.setMesero(restaurante.getUsuario("mesero1"));
        restaurante.agregarMesa(mesa1);

        Mesa mesa2 = new Mesa(2);
        mesa2.setMesero(restaurante.getUsuario("mesero2"));
        restaurante.agregarMesa(mesa2);

        // Agregamos platos
        restaurante.agregarPlato(new Plato("Hamburguesa", 100.0));
        restaurante.agregarPlato(new Plato("Pizza", 80.0));
        restaurante.agregarPlato(new Plato("Ensalada", 50.0));
        restaurante.agregarPlato(new Plato("Papas fritas", 30.0));

        int opcion;
        do {
            System.out.println("\n--- Restaurante ---");
            System.out.println("1. Ver mesas disponibles");
            System.out.println("2. Ver mesas ocupadas");
            System.out.println("3. Ver pedidos de una mesa");
            System.out.println("4. Agregar pedido a una mesa");
            System.out.println("5. Eliminar pedido de una mesa");
            System.out.println("6. Pagar pedido de una mesa");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Mesas disponibles ---");
                    for (Mesa mesa : restaurante.getMesasDisponibles()) {
                        System.out.println("Mesa " + mesa.getNumeroMesa());
                    }
                    break;

                case 2:
                    System.out.println("\n--- Mesas ocupadas ---");
                    for (Mesa mesa : restaurante.getMesasOcupadas()) {
                        System.out.println("Mesa " + mesa.getNumeroMesa() + " - Mesero: " + mesa.getMesero().getUsername());
                    }
                    break;

                case 3:
                    System.out.println("\n--- Ver pedidos de una mesa ---");
                    System.out.print("Ingresa el número de mesa: ");
                    int numeroMesa = scanner.nextInt();
                    scanner.nextLine();
                    Mesa mesa = restaurante.getMesa(numeroMesa);
                    if (mesa != null) {
                        mesa.mostrarPlatos();
                    }
                    break;

                case 4:
                    System.out.println("\n--- Agregar pedido a una mesa ---");
                    System.out.print("Ingresa el número de mesa: ");
                    numeroMesa = scanner.nextInt();
                    scanner.nextLine();
                    mesa = restaurante.getMesa(numeroMesa);
                    if (mesa != null) {
                        mesa.mostrarPlatos();
                        System.out.print("Ingresa el nombre del plato a agregar: ");
                        String nombrePlato = scanner.nextLine();
                        Plato plato = restaurante.getPlato(nombrePlato);
                        if (plato != null) {
                            mesa.agregarPlato(plato);
                            System.out.println("Pedido agregado correctamente");
                        } else {
                            System.out.println("El plato no existe");
                        }
                    } else {
                        System.out.println("La mesa no existe");
                    }
                    break;

                case 5:
                    System.out.println("\n--- Eliminar pedido de una mesa ---");
                    System.out.print("Ingresa el número de mesa: ");
                    numeroMesa = scanner.nextInt();
                    scanner.nextLine();
                    mesa = restaurante.getMesa(numeroMesa);
                    if (mesa != null) {
                        mesa.mostrarPlatos();
                        System.out.print("Ingresa el nombre del plato a eliminar: ");
                        String nombrePlato = scanner.nextLine();
                        Plato plato = restaurante.getPlato(nombrePlato);
                        if (plato != null) {
                            mesa.eliminarPlato(plato);
                            System.out.println("Pedido eliminado correctamente");
                        } else {
                            System.out.println("El plato no existe");
                        }
                    } else {
                        System.out.println("La mesa no existe");
                    }
                    break;

                case 6:
                    System.out.println("\n--- Pagar pedido de una mesa ---");
                    System.out.print("Ingresa el número de mesa: ");
                    numeroMesa = scanner.nextInt();
                    scanner.nextLine();
                    mesa = restaurante.getMesa(numeroMesa);
                    if (mesa != null) {
                        double total = mesa.calcularPrecioTotal();
                        System.out.println("El total a pagar es: " + total);
                        System.out.println("¿Desea pagar? (S/N)");
                        String respuesta = scanner.nextLine();
                        if (respuesta.equalsIgnoreCase("S")) {
                            mesa.pagar();
                            System.out.println("Pedido pagado correctamente");
                        }
                    } else {
                        System.out.println("La mesa no existe");
                    }
                    break;

                case 0:
                    System.out.println("Adiós");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
                            
                            
                            


