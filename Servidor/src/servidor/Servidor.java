/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;

/**
 *
 * @author PC
 */
public class Servidor {

    /**
     * @param arg
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String arg[]) throws IOException, ClassNotFoundException {
        ServidorPrincipal sp = new ServidorPrincipal(9990);
        sp.iniciar();
    }

}
