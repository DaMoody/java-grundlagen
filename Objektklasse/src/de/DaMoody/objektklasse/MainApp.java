/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.objektklasse;

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
        int x = 100;
        
        Integer objInt = new Integer(200);
        // hier wird der primitive Datentyp in einem Zeichenkontext
        // verwendet und muss als Zeichenkette bereitgestellt werden
        // int wird geboxt zu Integer (Klasse)
        // für die Klasse Integer kann die Methode toString() aufgerufen
        // werden
        // wird der Werrt des primitven Datentyps nicht mehr als Zeichenkette
        // benötigt, dann wird automatisch zurückgeboxt
        // Autoboxing: "Alles ist ein Objekt, aber nur wenn es unbedingt
        // sein muss"
        System.out.println( "Der Wert von x = " + x);
        System.out.println( "Der Wert von objInt = " + objInt);
    
        // wir experimentieren mit der KlasseDaMoody
        KlasseDaMoody Kd = new KlasseDaMoody(1000);
        // hier wird das Objekt in einem Zeichenkontext eingesetzt
        // -> das ruft automatisch die Methode toString() auf den Plan
        System.out.println( Kd );
    
    
        //---------------------------------------------------------------------
        
        int y= 100;
        
        if ( x == y ){
            System.out.println( "Die beiden Werte sind gleich ");
        }
        else {
            System.out.println("Die beiden Werte sind ungleich ");
        }
        
        String s1 = new String("Hallo Welt! ");
        String s2 = new String("Hallo Welt! ");
        
        if (s1 == s2) {
            System.out.println("Die beiden Werte sind gleich ");
        }
        else {
            System.out.println("Die beiden Werte sind ungleich");
        }
        
        if (s1.equals(s2)) {
            System.out.println("Die beiden Werte sind gleich");
        }
        else {
           System.out.println("Die beiden Werte sind ungleich");
           
        }
        String meiner = " Hallo Welt!! ";
        
        StringBuffer sb1 = new StringBuffer( meiner);
        StringBuffer sb2 = new StringBuffer(meiner);
        
        if (sb1 == sb2) {
            System.out.println("Die beiden Werte sind gleich ");
        }
        else {
            System.out.println("Die beiden Werte sind ungleich");
        }
        
        if (sb1.equals(sb2)) {
            System.out.println("Die beiden Werte sind gleich");
        }
        else {
           System.out.println("Die beiden Werte sind ungleich");
        }
        KlasseDaMoody Kd1 = new KlasseDaMoody( 1000);
        KlasseDaMoody Kd2 = new KlasseDaMoody(1000);
        KlasseDaMoody Kd3 = new KlasseDaMoody(1000);
        
        if (Kd1 == Kd2) {
            System.out.println("Die beiden Werte sind gleich ");
        }
        else {
            System.out.println("Die beiden Werte sind ungleich");
        }
        
        if (Kd1.equals(Kd2)) {
            System.out.println("Die beiden Werte sind gleich");
        }
        if (Kd2.equals(Kd3)) {
            System.out.println("Die beiden Werte sind gleich");
        }
        if (Kd1.equals(Kd3)) {
            System.out.println("Die beiden Werte sind gleich");
        }
        else {
           System.out.println("Die beiden Werte sind ungleich");
        }
        long demoLang = 1000l;
    
        for (int i = 0 ; i < 32; i++) {
        
        System.out.println(demoLang >> i);
        }
        for (int i = 0 ; i < 32; i++) {
        
        System.out.println(demoLang >>> i);
        }
    
        System.out.println(demoLang>>>32);
        }  
        System.out.println(hashCode(Kd1)) 
}
