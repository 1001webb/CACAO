/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import modelo.Jugabilidad;
import modelo.Loseta;
import modelo.LosetaRecolector;
import modelo.LosetaSelva;

/**
 * FXML Controller class
 *
 * @author chris
 */
public class GameController implements Initializable {

    @FXML
    private Button btn_loseta_selva;
    @FXML
    private Button btn_loseta_selva1;
    @FXML
    private Button btn_loseta_selva2;
    @FXML
    private Button btn_tablero_1x1;
    @FXML
    private Button btn_tablero_1x2;
    @FXML
    private Button btn_tablero_1x3;
    @FXML
    private Button btn_tablero_0x0;
    @FXML
    private Button btn_tablero_1x0;
    @FXML
    private Button btn_tablero_2x0;
    @FXML
    private Button btn_tablero_3x0;
    @FXML
    private Button btn_tablero_4x0;
    @FXML
    private Button btn_tablero_5x0;
    @FXML
    private Button btn_tablero_6x0;
    @FXML
    private Button btn_tablero_7x0;
    @FXML
    private Button btn_tablero_7x1;
    @FXML
    private Button btn_tablero_6x1;
    @FXML
    private Button btn_tablero_5x1;
    @FXML
    private Button btn_tablero_4x1;
    @FXML
    private Button btn_tablero_3x1;
    @FXML
    private Button btn_tablero_2x1;
    @FXML
    private Button btn_tablero_0x1;
    @FXML
    private Button btn_tablero_0x2;
    @FXML
    private Button btn_tablero_2x2;
    @FXML
    private Button btn_tablero_3x2;
    @FXML
    private Button btn_tablero_4x2;
    @FXML
    private Button btn_tablero_5x2;
    @FXML
    private Button btn_tablero_6x2;
    @FXML
    private Button btn_tablero_7x2;
    @FXML
    private Button btn_tablero_7x3;
    @FXML
    private Button btn_tablero_6x3;
    @FXML
    private Button btn_tablero_5x3;
    @FXML
    private Button btn_tablero_4x3;
    @FXML
    private Button btn_tablero_3x3;
    @FXML
    private Button btn_tablero_2x3;
    @FXML
    private Button btn_tablero_0x3;
    @FXML
    private Button btn_tablero_0x4;
    @FXML
    private Button btn_tablero_1x4;
    @FXML
    private Button btn_tablero_2x4;
    @FXML
    private Button btn_tablero_3x4;
    @FXML
    private Button btn_tablero_4x4;
    @FXML
    private Button btn_tablero_5x4;
    @FXML
    private Button btn_tablero_6x4;
    @FXML
    private Button btn_tablero_7x4;
    @FXML
    private Button btn_tablero_7x5;
    @FXML
    private Button btn_tablero_6x5;
    @FXML
    private Button btn_tablero_5x5;
    @FXML
    private Button btn_tablero_4x5;
    @FXML
    private Button btn_tablero_3x5;
    @FXML
    private Button btn_tablero_2x5;
    @FXML
    private Button btn_tablero_1x5;
    @FXML
    private Button btn_tablero_0x5;
    @FXML
    private Button btn_tablero_0x6;
    @FXML
    private Button btn_tablero_1x6;
    @FXML
    private Button btn_tablero_2x6;
    @FXML
    private Button btn_tablero_3x6;
    @FXML
    private Button btn_tablero_4x6;
    @FXML
    private Button btn_tablero_5x6;
    @FXML
    private Button btn_tablero_6x6;
    @FXML
    private Button btn_tablero_7x6;
    @FXML
    private Button btn_tablero_7x7;
    @FXML
    private Button btn_tablero_6x7;
    @FXML
    private Button btn_tablero_5x7;
    @FXML
    private Button btn_tablero_4x7;
    @FXML
    private Button btn_tablero_3x7;
    @FXML
    private Button btn_tablero_2x7;
    @FXML
    private Button btn_tablero_1x7;
    @FXML
    private Button btn_tablero_0x7;
    @FXML
    private Button btn_loseta_recolector2;
    @FXML
    private Button btn_loseta_recolector;
    @FXML
    private Button btn_loseta_recolector3;
    @FXML
    private Button btn_tablero_poblado;
    @FXML
    private Button btn_loseta_rotar;
    @FXML
    private Button btn_rotar;
    
    ////////////////////////////////////////////////////////////////////////////////
    
    public boolean fase1 = false;
    public boolean fase2 = false;
    public LosetaSelva temporal_selva;
    public LosetaRecolector temporal_recolector;
    public boolean turno = false;
    public int aux_selva;
    public int aux_recolector;
    public int cont_selva = 0;
    public int cont_recolector = 0;
    public String color;
    public boolean aux_color = true;
    public boolean imagen_recolector = false;
    public boolean imagen_selva = false;
    public boolean imagen_recolector_uso = false;
    public boolean imagen_selva_uso = false;
    
    static ServerSocket sServidor;
    static int conexiones=0;
    public Socket sCliente;
    public ObjectOutputStream fsalida;
    
    Jugabilidad j = new Jugabilidad();
    @FXML
    private Button btn_rojo;
    @FXML
    private Button btn_azul;
    @FXML
    private Button btn_amarillo;
    @FXML
    private Button btn_verde;
    @FXML
    private Button btn_loseta_recolector1;
    
    public boolean setLosetaRecolectorUso (int n){
        if(cont_recolector <= 11){
            j.setLosetaRecolectorUso(n, j.getLosetaRecolectorBaraja(cont_recolector));
            cont_recolector++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean setLosetaSelvaUso (int n){
        if(cont_selva <= 28){
            j.setLosetaSelvaUso(n, j.getLosetaSelvaBaraja(cont_selva));
            cont_selva++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public void clickTablero(int x, int y){
        if(fase1){
            if(j.validarFase1(x,y)){
                j.setTableroRecolector(temporal_recolector, x, y);      
                j.setTableroLoseta(x, y, color);
                fase1 = false;
                imagen_recolector = true;
                if(setLosetaRecolectorUso(aux_recolector)){
                    imagen_recolector_uso = true;
                    if(aux_recolector == 0){
                        //al boton 80 j.getImagenRecolector(aux_recolector)
                    }
                    if(aux_recolector == 1){
                        // al 81 j.getImagenRecolector(aux_recolector)
                    }
                    if(aux_recolector == 2){
                        //al 82 j.getImagenRecolector(aux_recolector)
                    }
                }
                else{
                    if(aux_recolector == 0){
                        //al boton 80 imagen en blanco
                    }
                    if(aux_recolector == 1){
                        // al 81 imagen en blanco
                    }
                    if(aux_recolector == 2){
                        //al 82 imagen en blanco
                    }
                }
                if(j.verificarFase2()){
                    fase2 = true;
                    //avisar que hay fase dos
                } 
                else{
                    //notificar que fin del turno
                }
            }
            else{
                //enviar mensaje de jugada invalida
            }
        }
        if(fase2){
            if(j.validarFase2(x,y)){
                j.setTableroSelva(temporal_selva, x, y);
                //se pone la imagen al boton
                fase2 = false;
                //mensaje que espere al proximo turno 
                j.setTableroLoseta(x, y, color);
                if(setLosetaRecolectorUso(aux_selva)){
                    if(aux_selva == 0){
                        //al boton 70 j.getImagenRecolector(aux_recolector)
                    }
                    if(aux_selva == 1){
                        // al 71 j.getImagenRecolector(aux_recolector)
                    }                
                }
                else{
                    if(aux_selva == 0){
                        //al boton 70 imagen en blanco
                    }
                    if(aux_selva == 1){
                        // al 71 imagen en blanco
                    }
                }               
            }
        }       
        j.fase3(color);
    }
    
    public void clickRecolector(int x){
        if(fase1){
            temporal_recolector = j.getLosetaRecolectorUso(x);
            aux_recolector = x;
        }
    }
    
    public void clickSelva(int x){
        if(fase2 == true){
            temporal_selva = j.getLosetaSelvaUso(x);
            aux_selva = x;
        }
        else
        {
            //mensaje de que no esta en fase dos
        }
    }

    public void EnviarObjeto(Object ob) throws IOException{
        try {
            fsalida = new ObjectOutputStream(sCliente.getOutputStream());
            fsalida.writeObject(ob);
        } catch (SocketException se) {
            System.out.println("Error -> "+se.getMessage());
        } catch (IOException e) {
            System.out.println("Error -> "+e.getMessage());
        }
    }
    
    public void finalizar(){
        try{
            System.out.println("Finalizado");
            fsalida.close();
            sCliente.close();}
        catch(IOException e){
            System.out.println("Error -> "+e.getMessage());
        }
    }
    
    public void Conexion() throws IOException{
        try {
            sCliente =new Socket("Localhost",9990);
        } catch (IOException ex) {
            Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("CONEXION INICIADA");
        System.out.println("Conectado a : "+ sCliente.getRemoteSocketAddress());

        for(int i=0;i<2;i++){
            for(int p=0;p<2;p++){
                EnviarObjeto(j.getTableroLoseta(i, p));
            }
        }
        
        for(int i=0;i<8;i++){
            for(int p=0;p<8;p++){
                EnviarObjeto(j.getTableroRecolector(i, p));
            }
        }
        
        for(int q=8;q<8;q++){
            for(int p=8;p<8;p++){
                EnviarObjeto(j.getTableroSelva(q, p));
            }
        }
        
        finalizar();
    }
    
    
    /**
     * Initializes the controller class.
     */
    ////////////////////////////////////////////////////////////////////////////////
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        System.out.println("Cliente : "+ sCliente.getRemoteSocketAddress());
        try {
            sServidor = new ServerSocket(9990);
            System.out.println(" - SERVIDOR INICIADO - ");
            System.out.println(" - Esperando Cliente - ");
            
            while(conexiones <= 4){
                try{
                    sCliente = sServidor.accept();
                    System.out.println("Se ha conectado un cliente");
                } catch(SocketException ns){
                    break;
                }
                conexiones++;
            }
            
                for(int a=0;a<8;a++){
                    for(int b=0;b<8;b++){
                        ObjectInputStream perEnt = new ObjectInputStream(sCliente.getInputStream());
                        Loseta Los = (modelo.Loseta) perEnt.readObject(); 
                        j.setTableroLoseta2(a, b, Los);   
                    }
                }
                
                for(int a=0;a<8;a++){
                    for(int q=0;q<8;q++){
                        ObjectInputStream perEnt = new ObjectInputStream(sCliente.getInputStream());
                        LosetaRecolector LosR = (modelo.LosetaRecolector) perEnt.readObject(); 
                        j.setTableroRecolector(LosR, a, q);   
                    }
                }
                
                for(int a=0;a<8;a++){
                    for(int q=0;q<8;q++){
                        ObjectInputStream perEnt = new ObjectInputStream(sCliente.getInputStream());
                        LosetaSelva LosS = (modelo.LosetaSelva) perEnt.readObject(); 
                        j.setTableroSelva(LosS, a, q);
                    }
                }
            
            j.llenarBarajaSelva();
            setLosetaSelvaUso(0);//agregar imagenes
            setLosetaSelvaUso(1);
            j.llenarBarajaRecolector(color);
            setLosetaRecolectorUso(1);
            j.getImagenRecolector(1); 
            setLosetaRecolectorUso(2);//agregar imagenes
            j.getImagenRecolector(2); 
            setLosetaRecolectorUso(3);
            j.getImagenRecolector(3);
            if(turno == true){
            //notificar que es mi turno
                fase1 = true;
            }
        } catch (IOException e) {
            System.out.println(e);
            finalizar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    

    private void click_agarrar(ActionEvent event) {
        
    }

    @FXML
    private void click_70(ActionEvent event) {
        clickSelva(0);
    }

    @FXML
    private void click_71(ActionEvent event) {
        clickSelva(1);
    }

    @FXML
    private void click_1(ActionEvent event) {
        clickTablero(0,0);
    }

    @FXML
    private void click_9(ActionEvent event) {
        clickTablero(1,0);
    }

    @FXML
    private void click_17(ActionEvent event) {
        clickTablero(2,0);
    }

    @FXML
    private void click_25(ActionEvent event) {
        clickTablero(3,0);
    }

    @FXML
    private void click_33(ActionEvent event) {
        clickTablero(4,0);
    }

    @FXML
    private void click_41(ActionEvent event) {
        clickTablero(5,0);
    }

    @FXML
    private void click_49(ActionEvent event) {
        clickTablero(6,0);
    }

    @FXML
    private void click_57(ActionEvent event) {
        clickTablero(6,0);
    }

    @FXML
    private void click_58(ActionEvent event) {
        clickTablero(6,1);
    }

    @FXML
    private void click_50(ActionEvent event) {
        clickTablero(5,1);
    }

    @FXML
    private void click_42(ActionEvent event) {
        clickTablero(5,1);
    }

    @FXML
    private void click_34(ActionEvent event) {
        clickTablero(4,1);
    }

    @FXML
    private void click_26(ActionEvent event) {
        clickTablero(3,1);
    }

    @FXML
    private void click_18(ActionEvent event) {
        clickTablero(2,1);
    }

    @FXML
    private void click_10(ActionEvent event) {
        clickTablero(1,1);
    }

    @FXML
    private void click_2(ActionEvent event) {
        clickTablero(0,1);
    }

    @FXML
    private void click_3(ActionEvent event) {
        clickTablero(0,2);
    }

    @FXML
    private void click_11(ActionEvent event) {
        clickTablero(1,2);
    }

    @FXML
    private void click_19(ActionEvent event) {
        clickTablero(2,2);
    }

    @FXML
    private void click_27(ActionEvent event) {
        clickTablero(3,2);
    }

    @FXML
    private void click_35(ActionEvent event) {
        clickTablero(4,2);
    }

    @FXML
    private void click_43(ActionEvent event) {
        clickTablero(5,2);
    }

    @FXML
    private void click_51(ActionEvent event) {
        clickTablero(6,2);
    }

    @FXML
    private void click_59(ActionEvent event) {
        clickTablero(7,2);
    }

    @FXML
    private void click_60(ActionEvent event) {
        clickTablero(7,3);
    }

    @FXML
    private void click_52(ActionEvent event) {
        clickTablero(6,3);
    }

    @FXML
    private void click_44(ActionEvent event) {
        clickTablero(5,3);
    }

    @FXML
    private void click_36(ActionEvent event) {
        clickTablero(4,3);
    }

    @FXML
    private void click_28(ActionEvent event) {
        clickTablero(3,3);
    }

    @FXML
    private void click_20(ActionEvent event) {
        clickTablero(2,3);
    }

    @FXML
    private void click_12(ActionEvent event) {
        clickTablero(1,3);
    }

    @FXML
    private void click_4(ActionEvent event) {
        clickTablero(0,3);
    }

    @FXML
    private void click_5(ActionEvent event) {
        clickTablero(0,4);
    }

    @FXML
    private void click_13(ActionEvent event) {
        clickTablero(1,4);
    }

    @FXML
    private void click_21(ActionEvent event) {
        clickTablero(2,4);
    }

    @FXML
    private void click_29(ActionEvent event) {
        clickTablero(3,4);
    }

    @FXML
    private void click_37(ActionEvent event) {
        clickTablero(4,4);
    }

    @FXML
    private void click_45(ActionEvent event) {
        clickTablero(5,4);
    }

    @FXML
    private void click_53(ActionEvent event) {
        clickTablero(6,4);
    }

    @FXML
    private void click_61(ActionEvent event) {
        clickTablero(7,4);
    }

    @FXML
    private void click_62(ActionEvent event) {
        clickTablero(7,5);
    }

    @FXML
    private void click_54(ActionEvent event) {
        clickTablero(6,5);
    }

    @FXML
    private void click_46(ActionEvent event) {
        clickTablero(5,5);
    }

    @FXML
    private void click_38(ActionEvent event) {
        clickTablero(4,5);
    }

    @FXML
    private void click_30(ActionEvent event) {
        clickTablero(3,5);
    }

    @FXML
    private void click_22(ActionEvent event) {
        clickTablero(2,5);
    }

    @FXML
    private void click_14(ActionEvent event) {
        clickTablero(1,5);
    }

    @FXML
    private void click_6(ActionEvent event) {
        clickTablero(0,5);
    }

    @FXML
    private void click_7(ActionEvent event) {
        clickTablero(0,6);
    }

    @FXML
    private void click_15(ActionEvent event) {
        clickTablero(1,6);
    }

    @FXML
    private void click_23(ActionEvent event) {
        clickTablero(2,6);
    }

    @FXML
    private void click_31(ActionEvent event) {
        clickTablero(3,6);
    }

    @FXML
    private void click_39(ActionEvent event) {
        clickTablero(4,6);
    }

    @FXML
    private void click_47(ActionEvent event) {
        clickTablero(5,6);
    }

    @FXML
    private void click_55(ActionEvent event) {
        clickTablero(6,6);
    }

    @FXML
    private void click_63(ActionEvent event) {
        clickTablero(7,6);
    }

    @FXML
    private void click_64(ActionEvent event) {
        clickTablero(7,7);
    }

    @FXML
    private void click_56(ActionEvent event) {
        clickTablero(6,7);
    }

    @FXML
    private void click_48(ActionEvent event) {
        clickTablero(5,7);
    }

    @FXML
    private void click_40(ActionEvent event) {
        clickTablero(4,7);
    }

    @FXML
    private void click_32(ActionEvent event) {
        clickTablero(3,7);
    }

    @FXML
    private void click_24(ActionEvent event) {
        clickTablero(2,7);
    }

    @FXML
    private void click_16(ActionEvent event) {
        clickTablero(1,7);
    }

    @FXML
    private void click_8(ActionEvent event) {
        clickTablero(0,7);
    }

    @FXML
    private void click_81(ActionEvent event) {
        clickRecolector(1);
    }

    @FXML
    private void click_80(ActionEvent event) {  
        clickRecolector(0);
    }

    @FXML
    private void click_82(ActionEvent event) {
        clickRecolector(2);
    }

    @FXML
    private void click_rotar(ActionEvent event) {
        //rota la imagen del boton o el boton
        int aux = temporal_recolector.getArriba();
        temporal_recolector.setArriba(temporal_recolector.getIzq());
        temporal_recolector.setIzq(temporal_recolector.getAbajo());
        temporal_recolector.setAbajo(temporal_recolector.getDer());
        temporal_recolector.setDer(aux);
    }

    @FXML
    private void click_rojo(ActionEvent event) {
        if(aux_color){
            color = "rojo";
            aux_color = false;
        }
    }

    @FXML
    private void click_azul(ActionEvent event) {
        if(aux_color){
            color = "azul";
            aux_color = false;
        }
    }

    @FXML
    private void click_amarillo(ActionEvent event) {
        if(aux_color){
            color = "amarillo";
            aux_color = false;
        }
    }

    @FXML
    private void click_verde(ActionEvent event) {
        if(aux_color){
            color = "verde";
            aux_color = false;
        }
    }
    
}
