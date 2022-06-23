/**
 *Nombre del autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación: 14/05/2021
 *Última fecha de actualización: 18/05/2021
 *Descripción de la clase: Aquí se crean las variables donde se guardan los
 * nombres de los usuarios
 */
package pojo;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String contraseña;
    private String tipo;
    
    public Usuario(){
        
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
