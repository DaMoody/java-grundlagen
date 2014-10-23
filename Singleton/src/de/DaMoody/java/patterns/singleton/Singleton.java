/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.patterns.singleton;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        throw new CloneNotSupportedException();
    }

    public static Singleton getInstance() {
        
           return instance;
    }
} 
    
    



