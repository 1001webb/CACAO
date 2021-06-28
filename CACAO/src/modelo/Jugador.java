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
public class Jugador {
    
    private int cacao;
    private int monedas;
    private int sol;
    private int rio;

    public Jugador(){
        cacao = 0;
        monedas = 0;
        sol = 0;
        rio = -12;
    }
    
    /////////////////////////////////////////////////////////////////////////////
    
    public void setCacao(int cacao){
        this.cacao = cacao;
    }
    
    public void setMonedas(int monedas){
        this.monedas = monedas;
    }
    
    public void setSol(int sol){
        this.sol = sol;
    }
    
    public void setRio(int rio){
        this.rio = rio;
    }
    
    /////////////////////////////////////////////////////////////////////////////
    
    public int getCacao(){
        return cacao;
    }
    
    public int getMonedas(){
        return monedas;
    }
    
    public int getSol(){
        return sol;
    }
    
    public int getRio(){
        return rio;
    }
}
