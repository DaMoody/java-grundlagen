/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DannyB.paket1.demo;

import de.DannyB.paket1.KlasseA;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class KlasseC {
    
    public void test() {
        
       KlasseA ka = new KlasseA();
        
        System.out.println("PinNummer lautet;" + ka.pinNummer);
    }
}
