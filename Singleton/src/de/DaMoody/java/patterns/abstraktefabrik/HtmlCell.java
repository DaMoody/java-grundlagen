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
public class HtmlCell extends Cell {

    /**
     * der Konstruktor der Klasse reicht den Wert für den Zellinhalt direkt an
     * den Konstruktor der Cell-Klasse weiter
     * @param c 
     */
    
    public HtmlCell(String c) {
        super(c);
    }

   
    
    
    @Override
    public void display() {
        System.out.println("\t\t<td>" + this.content + "</td>");
    }
    


}
