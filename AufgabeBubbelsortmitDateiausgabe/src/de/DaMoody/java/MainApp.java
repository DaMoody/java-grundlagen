/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        int [] feld = {8, 10, 5, 1, 3, 4, 2, 6, 7, 9};
        KlasseSchreiben.DatenAusgabe("unsorted.txt",feld);
        BubbleSort.sortieren(feld);
        KlasseSchreiben.DatenAusgabe("sorted.txt",feld );
    }
    
}
