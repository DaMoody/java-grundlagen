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
public class RegalBrummkreisel extends SpielzeugLager{

    @Override
    public Spielzeug nimmAusRegal() {
        return new Brummkreisel();
    }
    
}
