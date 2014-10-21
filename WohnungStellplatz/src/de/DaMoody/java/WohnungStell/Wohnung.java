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
public class Wohnung extends Stellplatz {
    
    private Stellplatz stellPlatz;
    
    public void setLink(Stellplatz s) {
        this.stellPlatz = s;
    }

    public void removelink() {
        this.stellPlatz = null;
    }
    public Stellplatz getLink() {
        return this.stellPlatz;
    }
}

