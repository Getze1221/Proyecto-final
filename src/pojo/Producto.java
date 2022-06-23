/**
 *Nombre del autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación: 14/05/2021
 *Última fecha de actualización: 22/05/2021
 *Descripción de la clase: Aquí se crean las variables donde se guardan los
 * nombres de los productos
 */
package pojo;

public class Producto {

    private String id;
    private String nombre;
    private String precio;

    public Producto() {
    }


    public Producto(String id, String nombre, String precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    //Retorna el nombre y precio
    @Override
    public String toString() {
        return  nombre + "$: " + precio;
    }

    
}
