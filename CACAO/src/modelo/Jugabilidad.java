/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.LobbyController;

/**
 *
 * @author chris
 */
public class Jugabilidad {
    
    private LosetaSelva losetas_selva_baraja [];
    
    private LosetaSelva losetas_selva_uso [];
    
    private LosetaRecolector losetas_recolector_baraja [];
    
    private LosetaRecolector losetas_recolector_uso [];
    
    private LosetaSelva tablero_selva [][];
    
    private LosetaRecolector tablero_recolector [][];
    
    private Loseta tablero_loseta [][];
    
    private Jugador jugador;
    
    /////////////////////////////////////////////////////////////////////////////
    
    public int cont_selva_baraja = 0;
    public int cont_recolector_baraja = 0;
    
        
    LobbyController c = new LobbyController();
    
    /////////////////////////////////////////////////////////////////////////////
    
    public Jugabilidad (){
        losetas_selva_baraja = new LosetaSelva [28];
        losetas_selva_uso = new LosetaSelva [2];
        losetas_recolector_baraja = new LosetaRecolector [11];
        losetas_recolector_uso = new LosetaRecolector [3];
        tablero_selva = new LosetaSelva [8][8];
        tablero_recolector = new LosetaRecolector [8][8];
        tablero_loseta = new Loseta [8][8];
        jugador = new Jugador();
        
        for(int i = 0; i <= 27; i++){
            losetas_selva_baraja[i] = null;
        } 
        for(int i = 0; i <= 1; i++){
            losetas_selva_uso[i] = null;
        }
        for(int i = 0; i <= 10; i++){
            losetas_recolector_baraja[i] = null;
        }
        for(int i = 0; i <= 2; i++){
            losetas_recolector_uso[i] = null;
        }
        for(int i = 0; i <= 8; i++){
            for(int j = 0; j <= 8; j++){
                tablero_selva [i][j] = null;
            }
        }
        for(int i = 0; i <= 8; i++){
            for(int j = 0; j <= 8; j++){
                tablero_recolector [i][j] = null;
            }
        }
        for(int i = 0; i <= 8; i++){
            for(int j = 0; j <= 8; j++){
                tablero_loseta [i][j] = null;
            }
        }
    }
    
    public void llenarBarajaRecolector (String color){
        
        LosetaRecolector loseta1 = new LosetaRecolector("/img.recolector/R1.png",1,1,1,1);  
        LosetaRecolector loseta2 = new LosetaRecolector("/img.recolector/R1.png",1,1,1,1);
        LosetaRecolector loseta3 = new LosetaRecolector("/img.recolector/R1.png",1,1,1,1);
        LosetaRecolector loseta4 = new LosetaRecolector("/img.recolector/R1.png",1,1,1,1);
        LosetaRecolector loseta5 = new LosetaRecolector("/img.recolector/R2.png",0,2,1,1);
        LosetaRecolector loseta6 = new LosetaRecolector("/img.recolector/R2.png",0,2,1,1);
        LosetaRecolector loseta7 = new LosetaRecolector("/img.recolector/R2.png",0,2,1,1);
        LosetaRecolector loseta8 = new LosetaRecolector("/img.recolector/R2.png",0,2,1,1);
        LosetaRecolector loseta9 = new LosetaRecolector("/img.recolector/R2.png",0,2,1,1);
        LosetaRecolector loseta10 = new LosetaRecolector("/img.recolector/R4.png",0,3,1,0);
        LosetaRecolector loseta11 = new LosetaRecolector("/img.recolector/R3.png",0,3,0,1);

        
        int n = 0;
        while(n != 11){
            int rand = (int)(Math.random()*10+0);
            if(losetas_recolector_baraja[rand] == null && n == 0){
                losetas_recolector_baraja[rand] = loseta1;
                n++;
            }    
            if(losetas_recolector_baraja[rand] == null && n == 1){
                losetas_recolector_baraja[rand] = loseta2;
                n++;
            } 
            if(losetas_recolector_baraja[rand] == null && n == 2){
                losetas_recolector_baraja[rand] = loseta3;
                n++;
            } 
            if(losetas_recolector_baraja[rand] == null && n == 3){
                losetas_recolector_baraja[rand] = loseta4;
                n++;
            } 
            if(losetas_recolector_baraja[rand] == null && n == 4){
                losetas_recolector_baraja[rand] = loseta5;
                n++;
            } 
            if(losetas_recolector_baraja[rand] == null && n == 5){
                losetas_recolector_baraja[rand] = loseta6;
                n++;
            } 
            if(losetas_recolector_baraja[rand] == null && n == 6){
                losetas_recolector_baraja[rand] = loseta7;
                n++;
            } 
            if(losetas_recolector_baraja[rand] == null && n == 7){
                losetas_recolector_baraja[rand] = loseta8;
                n++;
            } 
            if(losetas_recolector_baraja[rand] == null && n == 8){
                losetas_recolector_baraja[rand] = loseta9;
                n++;
            }
            if(losetas_recolector_baraja[rand] == null && n == 9){
                losetas_recolector_baraja[rand] = loseta10;
                n++;
            } 
            if(losetas_recolector_baraja[rand] == null && n == 10){
                losetas_recolector_baraja[rand] = loseta11;
                n++;
            }         
        }
    }
    
    public void llenarBarajaSelva (){
        losetas_selva_baraja[5] = new LosetaSelva("/img.selva/cacao1.png",1,1);
        losetas_selva_baraja[9] = new LosetaSelva("/img.selva/cacao1.png",1,1);
        losetas_selva_baraja[25] = new LosetaSelva("/img.selva/cacao1.png",1,1);
        losetas_selva_baraja[15] = new LosetaSelva("/img.selva/cacao1.png",1,1);
        losetas_selva_baraja[19] = new LosetaSelva("/img.selva/cacao1.png",1,1);
        losetas_selva_baraja[11] = new LosetaSelva("/img.selva/cacao1.png",1,1);
        losetas_selva_baraja[4] = new LosetaSelva("/img.selva/cacao2.png",1,2);
        losetas_selva_baraja[7] = new LosetaSelva("/img.selva/cacao2png",1,2);
        losetas_selva_baraja[18] = new LosetaSelva("/img.selva/venta2.png",2,2);
        losetas_selva_baraja[22] = new LosetaSelva("/img.selva/venta2.png",2,2);
        losetas_selva_baraja[1] = new LosetaSelva("/img.selva/venta3.png",2,3);
        losetas_selva_baraja[12] = new LosetaSelva("/img.selva/venta3.png",2,3);
        losetas_selva_baraja[8] = new LosetaSelva("/img.selva/venta3.png",2,3);
        losetas_selva_baraja[27] = new LosetaSelva("/img.selva/venta3.png",2,3);
        losetas_selva_baraja[26] = new LosetaSelva("/img.selva/venta4.png",2,4);
        losetas_selva_baraja[13] = new LosetaSelva("/img.selva/mina1.png",3,1);
        losetas_selva_baraja[14] = new LosetaSelva("/img.selva/mina1.png",3,1);
        losetas_selva_baraja[21] = new LosetaSelva("/img.selva/mina2.png",3,2);
        losetas_selva_baraja[10] = new LosetaSelva("/img.selva/agua.png",4,1);
        losetas_selva_baraja[2] = new LosetaSelva("/img.selva/agua.png",4,1);
        losetas_selva_baraja[17] = new LosetaSelva("/img.selva/agua.png",4,1);
        losetas_selva_baraja[23] = new LosetaSelva("/img.selva/solar.png",5,1);
        losetas_selva_baraja[3] = new LosetaSelva("/img.selva/solar.png",5,1);
        losetas_selva_baraja[0] = new LosetaSelva("/img.selva/templo.png",6,1);
        losetas_selva_baraja[6] = new LosetaSelva("/img.selva/templo.png",6,1);
        losetas_selva_baraja[16] = new LosetaSelva("/img.selva/templo.png",6,1);
        losetas_selva_baraja[20] = new LosetaSelva("/img.selva/templo.png",6,1);
        losetas_selva_baraja[24] = new LosetaSelva("/img.selva/templo.png",6,1);

    }
    
     
    /////////////////////////////////////////////////////////////////////////////
    
    public void setLosetaSelvaUso (int n, LosetaSelva loseta){
        
    }
    
    public void setLosetaRecolectorUso(int n, LosetaRecolector loseta){
        losetas_recolector_uso[n] = loseta;
    }
    
    public void setTableroRecolector(LosetaRecolector loseta, int x, int y){
        tablero_recolector [x][y] = loseta;
    }
    
    public void setTableroSelva(LosetaSelva loseta, int x, int y){
        tablero_selva [x][y] = loseta;
    }
    
    public void setTableroLoseta(int x, int y, String c){
        tablero_loseta [x][y] = new Loseta();
        tablero_loseta [x][y].setColor(c);
        
    }
    
    public void setTableroLoseta2(int x, int y, Loseta l){
        tablero_loseta [x][y] = l;       
    }
    
    public void setRecolectorImagen(int x, String imagen){
        losetas_recolector_baraja[x].setImagen(imagen);
    }
    
    public void setSelvaImagen(int x, String imagen){
        losetas_selva_baraja[x].setImage(imagen);
    }
    
    /////////////////////////////////////////////////////////////////////////////
    
    
    public LosetaRecolector getLosetaRecolectorBaraja(int n){
        return losetas_recolector_baraja[n];
    }
    
    public LosetaSelva getLosetaSelvaBaraja (int n){
        return losetas_selva_baraja[n];
    }
    
    public LosetaRecolector getLosetaRecolectorUso (int n){
        return losetas_recolector_uso [n];
    }
    
    public LosetaSelva getLosetaSelvaUso (int n){
        return losetas_selva_uso [0];      
    }
    
    public String getImagenRecolector(int n){
        return losetas_recolector_uso[n].getImagen();
    }
    
    public LosetaRecolector getTableroRecolector(int x, int y){
        return tablero_recolector [x][y];
    }
    
    public LosetaSelva getTableroSelva(int x, int y){
        return tablero_selva [x][y];
    }
    
    public Loseta getTableroLoseta(int x, int y){
        return tablero_loseta [x][y];
    }
    
    /////////////////////////////////////////////////////////////////////////////
    
    public boolean validarFase1(int x, int y){
        if(tablero_recolector[x][y] == null){
            if(tablero_recolector[x][y-1] == null){
                if(tablero_recolector[x][y+1] == null){
                    if(tablero_recolector[x-1][y] == null){
                        if(tablero_recolector[x+1][y] == null){
                            if(tablero_selva[x][y-1] != null) return true; 
                            if(tablero_selva[x][y+1] != null) return true; 
                            if(tablero_selva[x-1][y] != null) return true; 
                            if(tablero_selva[x+1][y] != null) return true; 
                        }
                    }
                }
            }
        }
        if(tablero_recolector[x][y] != null && jugador.getSol() > 0){
            jugador.setSol(jugador.getSol() - 1);
            return true;
        }
        return false;
    } 
    
    public boolean validarFase2(int x, int y){
        if(tablero_selva[x][y] == null){
            if(tablero_selva[x][y-1] == null){
                if(tablero_selva[x][y+1] == null){
                    if(tablero_selva[x-1][y] == null){
                        if(tablero_selva[x+1][y] == null){
                            if(tablero_recolector[x][y-1] != null){
                                if(tablero_recolector[x][y-1] != null && tablero_recolector[x-1][y] != null || tablero_recolector[x+1][y] != null) return true;
                                if(tablero_recolector[x][y+1] != null && tablero_recolector[x-1][y] != null || tablero_recolector[x+1][y] != null) return true;
                                if(tablero_recolector[x-1][y] != null && tablero_recolector[x][y-1] != null || tablero_recolector[x][y+1] != null) return true;
                                if(tablero_recolector[x+1][y] != null && tablero_recolector[x][y-1] != null || tablero_recolector[x][y+1] != null) return true;
                            } 
                        }
                    }
                }
            }
        }
        return false;
    } 
        
    public void fase3 (String color){//-------
        for(int i = 0; i <= 7; i++){
            for(int j = 0; j <= 7; j++){
                if(tablero_recolector [i][j] != null && tablero_loseta[i][j].getColor() == color && tablero_loseta[i][j].getCentro() == false){//------
                    if(tablero_selva [i][j-1] != null && tablero_loseta[i][j].getIzq() == false){//-----
                        switch(tablero_selva [i][j-1].getTipo()){
                            case 1:
                                jugador.setCacao((tablero_recolector [i][j].getIzq() * tablero_selva [i][j-1].getValor()) + jugador.getCacao());
                                if(jugador.getCacao() > 5) jugador.setCacao(5);
                                tablero_loseta[i][j].setIzq();
                                break;
                            case 2:
                                if(jugador.getCacao() != 0){
                                    jugador.setCacao(jugador.getCacao() - 1);
                                    jugador.setMonedas(jugador.getMonedas() + tablero_selva[i][j-1].getValor());
                                }
                                tablero_loseta[i][j].setIzq();
                                break;
                            case 3:
                                jugador.setMonedas(jugador.getMonedas() + tablero_selva[i][j-1].getValor());
                                tablero_loseta[i][j].setIzq();
                                break;                   
                            case 4:
                                jugador.setRio(jugador.getRio() + 3);
                                // cambian imagenes en el rio 
                                tablero_loseta[i][j].setIzq();
                                break;
                            case 5:
                                jugador.setSol(jugador.getSol() + 1); //AGREGAR VALIDACION DE tablero_losetas
                                tablero_loseta[i][j].setIzq();
                                break;
                            default:
                                break;
                        }
                    }
                    if(tablero_selva [i][j+1] != null && tablero_loseta[i][j].getDer() == false){
                        switch(tablero_selva [i][j+1].getTipo()){
                            case 1:
                                jugador.setCacao((tablero_recolector [i][j].getIzq() * tablero_selva [i][j+1].getValor()) + jugador.getCacao());
                                if(jugador.getCacao() > 5) jugador.setCacao(5);
                                tablero_loseta[i][j].setDer();
                                break;
                            case 2:
                                if(jugador.getCacao() != 0){
                                    jugador.setCacao(jugador.getCacao() - 1);
                                    jugador.setMonedas(jugador.getMonedas() + tablero_selva[i][j+1].getValor());
                                }
                                tablero_loseta[i][j].setDer();
                                break;
                            case 3:
                                jugador.setMonedas(jugador.getMonedas() + tablero_selva[i][j+1].getValor());
                                tablero_loseta[i][j].setDer();
                                break;
                            case 4:
                                jugador.setRio(jugador.getRio() + 3);
                                // cambian imagenes en el rio   
                                tablero_loseta[i][j].setDer();
                                break;
                            case 5:
                                jugador.setSol(jugador.getSol() + 1); //AGREGAR VALIDACION DE tablero_losetas
                                tablero_loseta[i][j].setDer();
                                break;
                            default:
                                break;
                        }
                    }
                    if(tablero_selva [i-1][j] != null && tablero_loseta[i][j].getArriba() == false){
                        switch(tablero_selva [i-1][j].getTipo()){
                            case 1:
                                jugador.setCacao((tablero_recolector [i][j].getIzq() * tablero_selva [i-1][j].getValor()) + jugador.getCacao());
                                if(jugador.getCacao() > 5) jugador.setCacao(5);
                                tablero_loseta[i][j].setArriba();
                                break;
                            case 2:
                                if(jugador.getCacao() != 0){
                                    jugador.setCacao(jugador.getCacao() - 1);
                                    jugador.setMonedas(jugador.getMonedas() + tablero_selva[i-1][j].getValor());
                                }
                                tablero_loseta[i][j].setArriba();
                                break;
                            case 3:
                                jugador.setMonedas(jugador.getMonedas() + tablero_selva[i-1][j].getValor());
                                tablero_loseta[i][j].setArriba();
                                break;
                            case 4:
                                jugador.setRio(jugador.getRio() + 3);
                                // cambian imagenes en el rio  
                                tablero_loseta[i][j].setArriba();
                                break;
                            case 5:
                                jugador.setSol(jugador.getSol() + 1); //AGREGAR VALIDACION DE tablero_losetas
                                tablero_loseta[i][j].setArriba();
                                break;
                            default:
                                break;
                        }
                    }
                    if(tablero_selva [i+1][j] != null && tablero_loseta[i][j].getAbajo() == false){
                        switch(tablero_selva [i+1][j].getTipo()){
                            case 1:
                                jugador.setCacao((tablero_recolector [i][j].getIzq() * tablero_selva [i+1][j].getValor()) + jugador.getCacao());
                                if(jugador.getCacao() > 5) jugador.setCacao(5);
                                tablero_loseta[i][j].setAbajo();
                                break;
                            case 2:
                                if(jugador.getCacao() != 0){
                                    jugador.setCacao(jugador.getCacao() - 1);
                                    jugador.setMonedas(jugador.getMonedas() + tablero_selva[i+1][j].getValor());
                                }
                                tablero_loseta[i][j].setAbajo();
                                break;
                            case 3:
                                jugador.setMonedas(jugador.getMonedas() + tablero_selva[i+1][j].getValor());
                                tablero_loseta[i][j].setAbajo();
                                break;
                            case 4:
                                jugador.setRio(jugador.getRio() + 3);
                                // cambian imagenes en el rio 
                                tablero_loseta[i][j].setAbajo();
                                break;
                            case 5:
                                jugador.setSol(jugador.getSol() + 1); //AGREGAR VALIDACION DE tablero_losetas
                                tablero_loseta[i][j].setAbajo();
                                break;
                            default:
                                break;
                        }
                    }
                }
                if(tablero_loseta[i][j].getIzq() == true && tablero_loseta[i][j].getDer() == true && tablero_loseta[i][j].getArriba() == true && tablero_loseta[i][j].getAbajo() == true){
                    tablero_loseta[i][j].setCentro();
                }
            }
        }
    }
    
    public boolean verificarFase2 (){
        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                if(tablero_recolector[x][y] != null){
                    if(tablero_recolector[x-1][y-1] != null){
                        if(tablero_selva[x][y-1] == null) return true;
                        if(tablero_selva[x-1][y] == null) return true;
                    }
                    if(tablero_recolector[x-1][y+1] != null){
                        if(tablero_selva[x][y+1] == null) return true;
                        if(tablero_selva[x-1][y] == null) return true;
                    }
                    if(tablero_recolector[x+1][y-1] != null){
                        if(tablero_selva[x][y-1] == null) return true;
                        if(tablero_selva[x+1][y] == null) return true;
                    }
                    if(tablero_recolector[x+1][y+1] != null){
                        if(tablero_selva[x][y+1] == null) return true;
                        if(tablero_selva[x+1][y] == null) return true;
                    }
                }
            }
        }
        return false;
    }
}
