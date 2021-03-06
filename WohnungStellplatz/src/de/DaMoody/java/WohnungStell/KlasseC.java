/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.WohnungStell;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class KlasseC {

    private static final int max = 4;

    private List<KlasseD> container = null;

    public KlasseC() {
        this.container = new ArrayList<>();
    }

    public void setLink(KlasseD objD) {

        if (this.container.size() < KlasseC.max) {
            this.container.add(objD);

        }
    }

    public void removeLink(KlasseD objD) {
        if (this.container.contains(objD)) {
            this.container.remove(objD);
        }
    }
    

    public KlasseD[] getAllLinks() {
        return this.container.toArray(new KlasseD[container.size()]);
    }

}
