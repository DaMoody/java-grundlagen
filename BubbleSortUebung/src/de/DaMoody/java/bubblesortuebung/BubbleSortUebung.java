/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.bubblesortuebung;

import java.util.Arrays;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class BubbleSortUebung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] feld = {8, 10, 5, 1, 3, 4, 2, 6, 7, 9};
        System.out.println( Arrays.toString( feld ) );
        BubbleSort.sortieren(feld);
        System.out.println( Arrays.toString( feld ) );
    }
   
}
