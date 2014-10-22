/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.UebAgrr;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class Schueler {
    private int id ;
    public static int nummer;
    private final String name;

    public  Schueler (int id, String name) {
        this.id = id;
        this.name = name;
        Schueler.nummer ++;
    }

   public int getId() {
    
        return this.nummer;
    }

    @Override
    public String toString() {
        return (this.getClass().getSimpleName() + " ID: " + this.nummer + " Name: " + this.name); 
    }
    
}
