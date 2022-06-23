/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import pojo.Usuario;

/**
 *
 * @author unsis
 */
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
