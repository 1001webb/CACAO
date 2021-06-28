/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Usuario implements Serializable{
    
    private String Nombre;
    private int Edad;
    private int Cedula;
    
    public Usuario(String u, int e, int c){
        Nombre=u;
        Edad=e;
        Cedula=c;
    }

    Usuario() {
        super();
    }
    
    public void setNombre(String n) {
        this.Nombre = n;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setEdad(int e) {
            this.Edad = e;
    }
    
    public int getEdad() {
        return Edad;
    }
    
    public void setCedula(int c) {
        this.Cedula = c;
    }
    
    public int getCedula() {
        return Cedula;
    }
    
}