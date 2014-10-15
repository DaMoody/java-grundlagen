




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class DemoKlasseA {
    public void etwasKritisches() {
        // das erzeugen eines neuen Printwriter.Objekts ist kritisch,
        // da unter Umständen die zu öffende Datei nicht existiert
        PrintWriter ausgabe = null;
        try {
             ausgabe = new PrintWriter(new FileWriter("outfile.txt"));
             
             for ( int i=0; i<10; i++){
                 ausgabe.println("Das ist die Ausgabezeile" + i);
             }
             
             
        }
        catch ( IOException e ) {
            System.err.println(e.getMessage());
        }
        
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        finally {
            if ( ausgabe != null)
                 ausgabe.close();
        }
    }
    
}
