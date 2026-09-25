package view;

import controller.GestorProductos;
import model.Producto; 
import java.util.Scanner;

public class Main {

    public static final GestorProductos GP = new GestorProductos();
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int elegir = 0;

        do {
            System.out.println("\n-------- Menu CRUD -----");
            System.out.println("1. Crear producto");
            System.out.println("2. Leer Productos");
            System.out.println("3. Actualizar productos");
            System.out.println("4. Eliminar productos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");

            if (entrada.hasNextInt()) {  
                elegir = entrada.nextInt();
                entrada.nextLine(); 

                switch (elegir) {
                    case 1:
                        System.out.println("----------- Crear producto ---------");
                        System.out.println("Ingrese ID del producto:");
                        int id = entrada.nextInt();
                        entrada.nextLine(); 
                        
                        System.out.println("Ingrese el nombre del producto:");
                        String nombre = entrada.nextLine();
                        
                        System.out.println("Ingrese el precio del producto:");
                        double precio = entrada.nextDouble();
                        entrada.nextLine(); 

                        
                        GP.agregarProducto(new Producto(id, nombre, precio));
                        break;


                        
                    case 2:
                        System.out.println("\n----------- Lista de productos -----------");
                        GP.mostrarProductos();
                        break;

                        
                        
                    case 3:
                        System.out.println("----------- Actualizar precio ---------");
                        System.out.println("Ingrese el ID del producto a actualizar:");
                        int actualizarId = entrada.nextInt();
                        
                        System.out.println("Ingrese el nuevo precio del producto:");
                        double newPrecio = entrada.nextDouble();
                        entrada.nextLine(); 

                        GP.actualizarProducto(actualizarId, newPrecio);
                        break;

                        
                    case 4:
                        
                        System.out.println("----------- Eliminar producto ---------");
                        System.out.println("Ingrese el ID del producto a eliminar:");
                        int eliminarID = entrada.nextInt();
                        entrada.nextLine(); 

                        GP.eliminarProducto(eliminarID);
                        break;


                        
                    case 5:
                        
                        System.out.println("Usted ha salido del sistema.");
                        break;

                        
                    default:
                        System.out.println("ERROR: Por favor ingrese un número válido del 1 al 5.");
                }

            } else {
                System.out.println("ERROR: Por favor ingrese un número válido.");
                entrada.next(); 
            }

        } while (elegir != 5);

        entrada.close();
    }
}
