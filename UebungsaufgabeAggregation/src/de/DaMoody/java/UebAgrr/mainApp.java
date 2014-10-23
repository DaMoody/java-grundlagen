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
public class mainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Schueler Mueller = new Schueler(1, "Klaus");
        Schueler Meier = new Schueler(1, "Hans");
        Schueler Betram = new Schueler(1, "Getnow");

        Kurs.auflisten();

    }
}
