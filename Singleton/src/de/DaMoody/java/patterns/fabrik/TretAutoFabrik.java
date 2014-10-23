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
public class TretAutoFabrik extends Fabrik {

    @Override
    public Fahrzeug erzeuge() {
        return new TretAuto();
    }
    
}
