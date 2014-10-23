/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.patterns.fabrik;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class FabrikMethode {
    
public Fahrzeug erzeuge (String art){
    
    Fahrzeug fzg = null;
    
    switch (art) {
        
        case "solar":
            fzg = new SolarAuto();
            break;
        
        case "diesel":
            fzg = new DieselAuto();
            break;
        
        case "tret":
            fzg = new TretAuto();
            break;
    }
    return fzg;
}



}
