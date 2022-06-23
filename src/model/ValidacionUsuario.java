/**
 *Nombre del autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación: 14/05/2021
 *Última fecha de actualización: 22/05/2021
 *Descripción de la clase: Aquí se modelan los objetos de usuario
 */
package model;

import pojo.Usuario;


public class ValidacionUsuario {
    public boolean validarUsuario(Usuario userExist, Usuario userCompare){
        return userExist.getNombre().compareTo(userCompare.getNombre())== 0 
                && userExist.getContraseña().compareTo(userCompare.getContraseña())==0;
    }
    
    public String getTipoUsuario(Usuario userExist, Usuario userCompare){
        if(userExist.getNombre().compareTo(userCompare.getNombre())== 0 
                && userExist.getContraseña().compareTo(userCompare.getContraseña())==0)
            return userExist.getTipo();
        
        return null;
    }
}
