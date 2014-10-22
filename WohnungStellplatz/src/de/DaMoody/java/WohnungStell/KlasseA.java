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

        if (this.b != null && this.b != objB) {
// wird das alte ObjektB aufgefordert, den Link auf das ObjektA (this) zu löschen
            this.b.removeLink(this);
        }

        this.b = objB;

        if (objB.getLink() != this) {
            objB.setLink(this);
        }

    }

    public void removeLink(KlasseB objB) {
        if (this.b != objB) {
            return;
        }
        KlasseB tmp = this.b;
        this.b = null;
        if (this == tmp.getLink()) {
            tmp.removeLink(this);
        }
    }

    public KlasseB getLink() {
        return this.b;
    }

}
