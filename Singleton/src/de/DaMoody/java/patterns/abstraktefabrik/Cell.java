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
public abstract class Cell {
    
    /**
     * wir wollen Textinformationen in der Zeile speichern
     */
    
    protected String content = "";
 
    /**
     * der Konstruktor der Klasse wird mit Parameter aufgerufen
     * 
     * @param c 
     */
    public Cell(String c) {
        this.content = c;
    }

    public abstract void display();

}
