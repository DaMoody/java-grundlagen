/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.WohnungStell;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class KlasseD {
  
    private static int nummer = 0;
    private int id;

    KlasseD(){
    this.id = KlasseD.nummer;
    KlasseD.nummer ++;
    }
    
    @Override
    public String toString() {
    return this.getClass().getSimpleName() + ":" + this.id;
    }
    
    
    
       
        
    
 
}
