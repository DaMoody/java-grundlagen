/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.auto;

import java.util.ArrayList;
import java.util.List;

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
    
    
        List<Car> autoListe = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
        autoListe.add( new Car((i % 2 == 0), i*100));
        }
        for(Car a: autoListe) {
            System.out.println( a );
        }
    }
}
    
