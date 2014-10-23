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
    public int id;
    public static int nummer;
    private static String name;

    public Schueler (int id , String name) {
        this.id = Schueler.nummer;
        this.name = Schueler.name;
        Schueler.nummer ++;
    }

    
  
   public int getId() {
    
        return this.id;
    }

    @Override
    public String toString() {
        return (this.getClass().getSimpleName() + " ID: " + Schueler.nummer + " Name: " + Schueler.name); 
    }
    
}
