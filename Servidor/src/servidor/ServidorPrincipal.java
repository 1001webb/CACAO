/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

/**
 *
 * @author PC
 */
import java.io.*;
import java.net.*;

public class ServidorPrincipal
{
    static ServerSocket sServidor;
    static Socket sCliente;
    static int puerto;
    static int conexiones=0;

    public ServidorPrincipal(int p) {
        puerto = p;
    }

    public void iniciar() throws IOException {
        try {
            System.out.println("Puerto: "+puerto );
            sServidor = new ServerSocket(puerto);
            System.out.println(" - SERVIDOR INICIADO - ");
            System.out.println(" - Esperando Cliente - ");
            
            while(conexiones <= 4){
                try{
                    sCliente = sServidor.accept();
                    System.out.println("Cliente : "+ sCliente.getRemoteSocketAddress());
                    System.out.println("Se ha conectado un cliente");
                } catch(SocketException ns){
                    
                    break;
                }
                conexiones++;
                HiloConexion hiloConexion = new HiloConexion(sCliente);
                hiloConexion.start();
            }
            System.out.println("Afuera");
            finalizar();
        } catch (IOException e) {
            System.out.println(e);
            finalizar();
        }
    }
    

    public void finalizar() {
        try {
            sCliente.close();
            sServidor.close();
            System.out.print("Conexion Finalizada!!");
        } catch (IOException e) {
           System.out.println(e);
        }
    }
}


