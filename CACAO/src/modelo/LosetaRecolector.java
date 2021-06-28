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
public class LosetaRecolector {
    private String imagen;
    
    private int izq;
    
    private int der;
    
    private int arriba;
    
    private int abajo;
    
    public LosetaRecolector(){
        this.imagen = "";
        this.izq = 0;
        this.der = 0;
        this.arriba = 0;
        this.abajo = 0;
    } 

    public LosetaRecolector(String imagen, int izq, int der, int arriba, int abajo){
        this.imagen = imagen;
        this.izq = izq;
        this.der = der;
        this.arriba = arriba;
        this.abajo = abajo;
    } 
    
    /////////////////////////////////////////////////////////////////////////////
    
    public void setImagen(String imagen){
        this.imagen = imagen;
    }
    
    public void setIzq(int izq){
        this.izq = izq;
    }
    
    public void setDer(int der){
        this.der = der;
    }
    
    public void setArriba(int arriba){
        this.arriba = arriba;
    }
    
    public void setAbajo(int abajo){
        this.abajo = abajo;
    }
    
    /////////////////////////////////////////////////////////////////////////////
    
    public String getImagen(){
        return imagen;
    }
    
    public int getIzq(){
        return izq;
    }
    
    public int getDer(){
        return der;
    }
    
    public int getArriba(){
        return arriba;
    }
    
    public int getAbajo(){
        return abajo;
    }
}
