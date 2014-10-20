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
public class NochEineAndereBox<T extends Number> {
    
    private T content;
    public void untersuche(T parameter){
        
        System.out.println("Content: " + content.getClass().getSimpleName());
        System.out.println("paramter: " + parameter.getClass().getSimpleName());
        
    }

    public void set ( T t) {
        
        this.content = t;
        
    }
}
