/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java;
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
        try {
            
            if (!true)
                throw new NoDataFoundException("keine Daten gefunden");
            else
                throw new FileNotFoundException("Datei xyz nicht gefunden");
        }
        catch( NoDataFoundException e) {
                
        }
        catch( FileNotFoundException e) {
                
        }
        catch( Exception e){
                
        }
    }
    
}
