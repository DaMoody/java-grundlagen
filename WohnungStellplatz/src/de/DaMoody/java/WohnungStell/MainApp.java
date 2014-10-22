/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.WohnungStell;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // bidirektionale Assoziation mit fester 1:1 Multiplizität
        KlasseA a = new KlasseA();
        KlasseB b = new KlasseB();
        KlasseB b1 = new KlasseB();

        a.setLink(b);
        a.setLink(b1);
        a.setLink(b1);
        a.removeLink(b1);
        
        KlasseC c = new KlasseC();
        
        c.setLink(new KlasseD());
        c.setLink(new KlasseD());
        c.setLink(new KlasseD());
        c.setLink(new KlasseD());
    for (KlasseD objD : c.getAllLinks()){
        System.out.println(objD);
    }
    
    }
}
