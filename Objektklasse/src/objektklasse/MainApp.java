/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objektklasse;

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
    }
    
}
