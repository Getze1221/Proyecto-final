/**
 *Nombre del autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación: 14/05/2021
 *Última fecha de actualización: 18/05/2021
 *Descripción de la clase: Aquí se crean las variables donde se guardan los
 * nombres de la comidatacos
 */
package pojo;


public class ComidaTacos {
    int id;
    String nombre;
    float precio;
    
    
    

    public ComidaTacos(int id, String nombre, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public ComidaTacos() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    //Retorna el nombre y el precio
    @Override
    public String toString() {
        return  nombre + "$:" + precio;
    }
    
    
    
    
    
}
