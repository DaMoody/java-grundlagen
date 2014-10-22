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
public class KlasseB {

    private KlasseA a = null;

    /**
     * stellt die Beziehung zum Objekt der KlasseB her und fordert das Objekt
     * der KlasseB auf, eine Beziehung zum sich selbst(this) herzustellen.
     *
     * @param objA
     */
    public void setLink(KlasseA objA) {

        if (this.a != null && this.a != objA) {
// wird das alte ObjektA aufgefordert, den Link auf das ObjektB (this) zu löschen
            this.a.removeLink(this);
        }

        this.a = objA;

        if (objA.getLink() != this) {
            objA.setLink(this);
        }

    }

    public void removeLink(KlasseA objA) {
        if (this.a != objA) {
            return;
        }
        KlasseA tmp = this.a;
        this.a = null;
        if (this == tmp.getLink()) {
            tmp.removeLink(this);
        }
    }

    public KlasseA getLink() {
        return this.a;
    }

}
