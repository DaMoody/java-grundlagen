/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class eineAndereBox {
    /**
     * Eine generische Methode, deren Typparameter auf die Parameter der Methode
     * angewendet wird.
     * Damit wird siohergestellt, dass die beiden Parameter der Methode den gleichen
     * generischen Typ verwenden und damit die privaten Attribute von MeineBox
     * den gleichen Datentyp besitzen und vergleichbar sind
     * @param <T>
     * @param mb1
     * @param mb2
     * @return 
     */
    
    public static <T> boolean vergleiche( MeineBox<T> mb1, MeineBox<T> mb2){
       
        return mb1.get().equals(mb2.get());
    }
    
}
