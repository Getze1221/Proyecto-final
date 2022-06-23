
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
