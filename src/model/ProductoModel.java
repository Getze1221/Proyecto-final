/**
 *Nombre del autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación: 14/05/2021
 *Última fecha de actualización: 22/05/2021
 *Descripción de la clase: Aquí se modelan los objetos de producto
 */
package model;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import pojo.Producto;

public class ProductoModel {
    
    
    public void crearProducto(List<Producto> lista, Producto producto) {
        lista.add(producto);

    }

    public void eliminarProducto(List<Producto> lista, String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo(nombre) == 0) {
                lista.remove(i);

                break;
            }
        }
    }

    public void actualizarProductos(List<Producto> lista, Producto producto) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo(producto.getNombre()) == 0) {
                lista.set(i, producto);
                break;
            }
        }
    }
    
     public void mostrarProductos(List<Producto> lista, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[3];

            fila[0] = lista.get(i).getId();
            fila[1] = lista.get(i).getNombre();
            fila[2] = lista.get(i).getPrecio();

            modelo.addRow(fila);
        }
    }

    
}
