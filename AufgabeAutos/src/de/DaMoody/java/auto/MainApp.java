/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.auto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class MainApp {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Car> autoListe = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            autoListe.add(new Car((i % 2 == 0), i * 100));
        }
        for (Car a : autoListe) {
            System.out.println(a);
        }
    
    
        
        HashSet<Car> hashCar = new HashSet<>();
        
        hashCar.add( new Car( true, 0));
        hashCar.add( new Car(true, 0));
        hashCar.add( new Car(true, 1000));
        hashCar.add( new Car(false, 1000));
        
        System.out.println("Das HashSet enthält "+ hashCar.size() +" Elemente");
        
    
        // wir testen ein Strung-Hashset<>();
        
        HashSet<String> hashString = new HashSet<>();
        
        hashString.add("Hallo ");
        hashString.add("wunderschöne ");
        hashString.add("Java-Welt ");
        
        for( String s: hashString ) {
            System.out.println( s + "HashCode: " + s.hashCode());
        }
        // wir setzen auf sortierte Kollektionen, TreeSet
        
        TreeSet<Integer> treeInt = new TreeSet<>();
        
        treeInt.add(1000);
        treeInt.add(500);
        treeInt.add(250);
        treeInt.add(750);
        treeInt.add(875);
        treeInt.add(225);
        
        for (Integer i : treeInt) {
            
            System.out.println(i);
        }
        
        TreeSet<String> treeString = new TreeSet<>();
        
        treeString.add("Anton");
        treeString.add("Zylinder");
        treeString.add("Paula");
        treeString.add("Berta");
        treeString.add("Cäsar");
        treeString.add("Ludwig");
        treeString.add("Emil");
        
        for (String s : treeString) {
            
            System.out.println(s);
           
        }
        //wir testen das TreeSet mit den Cars
        TreeSet<Car> treeCar = new TreeSet<>();
        
        treeCar.add( new Car(true, 2000));
        treeCar.add( new Car(true, 5000));
        treeCar.add( new Car(true, 1000));
        
        for ( Car c : treeCar) {
            
            System.out.println(c);
        }
    
    
    
    
    }
}
