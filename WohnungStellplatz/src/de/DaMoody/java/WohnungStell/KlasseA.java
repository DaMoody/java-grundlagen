/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.WohnungStell;



/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class KlasseA {

    private KlasseB b = null;

    /**
     * stellt die Beziehung zum Objekt der KlasseB her und fordert das Objekt
     * der KlasseB auf, eine Beziehung zum sich selbst (this) herzustellen.
     *
     * @param objB
     */
    public void setLink(KlasseB objB) {
        
        this.b = objB;
        
        if (objB.getLink() == null) {
            objB.setLink(this);
        }
    } 
    public void removelink() {
        this.b = null;
     
    }
    public KlasseB getLink() {
        return this.b;
    }

}
