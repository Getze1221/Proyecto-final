/**
 *Nombre del autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación: 14/05/2021
 *Última fecha de actualización: 22/05/2021
 *Descripción de la clase: Aquí se controla el contenido de las listas
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.ProductoModel;
import pojo.Producto;


public class ProductoController {
    
     ProductoModel model = new ProductoModel();

    public void crearProducto(List<Producto> lista, Producto producto) {
        model.crearProducto(lista, producto);
    }

    public void eliminarProducto(List<Producto> lista, String nombre) {
        model.eliminarProducto(lista, nombre);
    }

    public void actualizarProductos(List<Producto> lista, Producto producto) {
        model.actualizarProductos(lista, producto);
    }

    public void mostrarProductos(List<Producto> lista, DefaultTableModel modelo) {
        model.mostrarProductos(lista, modelo);
    }

}
