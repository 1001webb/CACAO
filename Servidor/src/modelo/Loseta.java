/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author chris
 */
public class Loseta {
    
    private boolean centro;
    private boolean arriba;
    private boolean abajo;
    private boolean izq;
    private boolean der;
    
    public Loseta(){
        centro = false;
        arriba = false;
        abajo = false;
        izq = false;
        der = false;
    }
    public Loseta(boolean c, boolean arr, boolean aba, boolean iz, boolean de){
        centro = c;
        arriba = arr;
        abajo = aba;
        izq = iz;
        der = de;
    }
    /////////////////////////////////////////////////////////////////////////////
    public void setCentro (){
        centro = true;
    }   
    public void setArriba (){
        arriba = true;
    }
    public void setAbajo (){
        abajo = true;
    }
    public void setIzq (){
        izq = true;
    }
    public void setDer (){
        der = true;
    }
   ////////////////////////////////////////////////////////////////////////////// 
    public boolean getCentro(){
        return centro;
    }
    public boolean getArriba(){
        return arriba;
    }
    public boolean getAbajo(){
        return abajo;
    }
    public boolean getIzq(){
        return izq;
    }
    public boolean getDer(){
        return der;
    }
    
}
