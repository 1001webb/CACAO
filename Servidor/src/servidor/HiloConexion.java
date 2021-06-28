/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Loseta;
import modelo.Usuario;
import modelo.LosetaRecolector;
import modelo.LosetaSelva;


/**
 *
 * @author PC
 */
public class HiloConexion extends Thread{
   
    private ObjectOutputStream fsalida;
    static Socket sCliente = null;
    private String host;
    private int Puerto;
    private modelo.Usuario user;
    private modelo.Loseta Los;
    private modelo.LosetaRecolector LosR;
    private modelo.LosetaSelva LosS;
    Usuario[][] matriz = new Usuario[2][2];
    LosetaRecolector[][] matR = new LosetaRecolector[8][8];
    LosetaSelva[][] matS = new LosetaSelva[8][8];
    Loseta[][] matL = new Loseta[8][8];
    
    
    public HiloConexion(Socket s){
        sCliente = s;
    }
    
    @Override
    public void run()
    {
        System.out.println("Cliente : "+ sCliente.getRemoteSocketAddress());
        try{
            
            try {
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                        ObjectInputStream perEnt = new ObjectInputStream(sCliente.getInputStream());
                        user = (modelo.Usuario) perEnt.readObject(); 
                        matriz[i][j]=user;   
                    }
                }
                
                /*for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        ObjectInputStream perEnt = new ObjectInputStream(sCliente.getInputStream());
                        Los = (modelo.Loseta) perEnt.readObject(); 
                        matL[i][j]=Los;   
                    }
                }*/
                
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        ObjectInputStream perEnt = new ObjectInputStream(sCliente.getInputStream());
                        LosR = (modelo.LosetaRecolector) perEnt.readObject(); 
                        matR[i][j]=LosR;   
                    }
                }
                
                /*for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        ObjectInputStream perEnt = new ObjectInputStream(sCliente.getInputStream());
                        LosR = (modelo.LosetaRecolector) perEnt.readObject(); 
                        matS[i][j]=LosS;   
                    }
                }*/
                
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                        System.out.println(matriz[i][j].getNombre()+"\n"+matriz[i][j].getEdad()+"\n"+matriz[i][j].getCedula());
                    }
                }
                
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        System.out.println(matR[i][j].getArriba()+"\n"+matR[i][j].getAbajo()+"\n"+matR[i][j].getDer()+"\n"+matR[i][j].getIzq()+"\n"+matR[i][j].getImagen());
                    }
                }
                
                //Broadcast();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HiloConexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        } catch (IOException e) {
            System.out.println("Error -> "+e.getMessage());
            finalizar();
        }
    }
    
    public void Broadcast() throws IOException{
        sCliente =new Socket(host,Puerto);
        System.out.println("CONEXION INICIADA");
        System.out.println("Conectado a : "+ sCliente.getRemoteSocketAddress());
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                user=matriz[i][j];
                EnviarObjeto(user);
            }
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                Los=matL[i][j];
                EnviarObjeto(Los);
            }
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                LosR=matR[i][j];
                EnviarObjeto(LosR);
            }
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                LosS=matS[i][j];
                EnviarObjeto(LosS);
            }
        }
    }
    
    public void EnviarObjeto(Object u){
        try {
            fsalida = new ObjectOutputStream(sCliente.getOutputStream());
            fsalida.writeObject(u);
        } catch (SocketException se) {
            System.out.println("Error -> "+se.getMessage());
        } catch (IOException e) {
            System.out.println("Error -> "+e.getMessage());
        }
    }
    
    public void finalizar() {
        try {
            sCliente.close();
            System.out.print("Conexion Finalizada!!");
        } catch (IOException e) {
           System.out.println("Error -> "+e.getMessage());
        }
        System.out.println("Saliendo ");
    }
    
}
