/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.patterns.abstraktefabrik;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public abstract class Row {
    
    protected List<Cell> cells = new ArrayList<>();
    
    /**
     * eine Methode um beliebig viele Zellen zu einer Zeile hinzuzufügen
     * 
     * @param c 
     */
    public void addCell(Cell c){
        
        this.cells.add(c);
    }
    
    public abstract void display();


}
