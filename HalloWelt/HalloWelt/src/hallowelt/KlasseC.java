/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hallowelt;

/**
 *
 * @author platz
 */
public class KlasseC extends AbstrakteKlasseA{

    public KlasseC(int deineZahl) {
        super(deineZahl);
    }

    @Override
    void ausgeben() {
        
        System.out.println( this.deineZahl);
    }
    
}
