/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 * @param <T>
 */
public class MeineBox <T>{
    
    private T value;
    
    public void set ( T wert ) {
        
        this.value = wert;
    }
    public T get() {
        
        return this.value;
    }
}
