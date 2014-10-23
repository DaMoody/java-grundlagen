/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.UebAgrr;

import java.util.TreeMap;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class Kurs {

    private TreeMap<Integer, Schueler> teilnehmer;
    private final int kid;
    private final String kname;

    public Kurs(int kid, String kname) {
        this.kid = kid;
        this.kname = kname;
    }

    /**
     *
     * @param s
     */
    public void einschreiben(Schueler s) {

        this.teilnehmer.put(s.getId(), s);
    }

    public void ausschreiben(Schueler s) {
        this.teilnehmer.remove(s.getId(), s);
    }

    public void auflisten() {
        teilnehmer.keySet().stream().forEach((_item) -> {
            System.out.println(kid + " - " + teilnehmer);
        });
    }

    @Override
    public String toString() {
        return (this.getClass().getSimpleName() + " Kurs: " + this.kid + " Name: " + this.kname);
    }

}
