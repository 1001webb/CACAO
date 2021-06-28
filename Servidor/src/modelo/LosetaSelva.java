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
public class LosetaSelva {
    
    private String imagen;
    private int tipo;
    private int valor;
    
    public LosetaSelva(){
        imagen = "";
        tipo = 0;
        valor = 0;
    }
    
    public LosetaSelva(String imagen, int tipo, int valor){
        this.imagen = imagen;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    /////////////////////////////////////////////////////////////////////////////
    
    public String getImagen(){
        return imagen;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public int getValor(){
        return valor;
    }
}
