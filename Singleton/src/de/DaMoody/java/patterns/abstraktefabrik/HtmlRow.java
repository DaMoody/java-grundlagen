/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.patterns.abstraktefabrik;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class HtmlRow extends Row{

    @Override
    public void display() {
       
        // die Startmarkierung einer Html-Zeile ausgeben
        System.out.println("\t<tr>");
        
        //alle Zellen der Zeile sollen sich selber ausgeben
        for( Cell c: this. cells) {
            c.display();
        }
        System.out.println("\t</tr>");
        
    }
    
    
    
}
