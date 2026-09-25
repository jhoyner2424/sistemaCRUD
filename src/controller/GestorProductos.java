package controller;

import model.Producto;
import java.util.ArrayList;
import java.util.List;


public class GestorProductos {
    

    public static final List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto registrado exitosamente");
    }

    
    
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("Actualmente el inventario no tiene productos");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }
    

    
    
    public boolean actualizarProducto(int idBuscado, double nuevoPrecio) {
        for (Producto p : productos) {
            if (p.getId() == idBuscado) {
                p.setPrecio(nuevoPrecio);
                System.out.println("Precio actualizado exitosamente");
                return true;
            }
        }
        System.out.println("Error: Producto no encontrado");
        return false;
    }
    
    
    
    

    public boolean eliminarProducto(int id) {
        for (Producto p : productos) {
            productos.remove(p);
            System.out.println("Producto eliminado exitosamente");
            return true;
            
            
        }
        System.out.println("Error: Producto no encontrado");
        return false;
    }
}
