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
public class HtmlTable extends Table {

    @Override
    public void display() {
    
        // die Startmarkierung der tabelle ausgeben
        System.out.println("<table>");
   
        // alle Zeilen der Tabelle ausgeben
        for(Row r: this.rows){
            r.display();
        }
    
        // die Endemarkierung der Html-Tabelle ausgeben
        System.out.println("</table>");
    }
    
}
