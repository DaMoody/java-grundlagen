/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.patterns.UeAufgSpielen;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class SpielzeugFabrikMethode {
    
public Spielzeug nimmAusRegal (String art){
    
    Spielzeug szg = null;
    
    switch (art) {
        
        case "Barbie":
            szg = new Barbie();
            break;
        
        case "Brummbaer":
            szg = new Brummbaer();
            break;
        
        case "Pistole":
            szg = new Pistole();
            break;
        case "Brummkreisel":
            szg = new Brummkreisel();
            break;
    }
    return szg;
}



}
