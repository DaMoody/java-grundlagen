/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.patterns;

import de.DaMoody.java.patterns.UeAufgSpielen.*;
import de.DaMoody.java.patterns.abstraktefabrik.*;
import de.DaMoody.java.patterns.fabrik.*;
import de.DaMoody.java.patterns.singleton.Singleton;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class mainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Singleton s = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

    // wir testen unsere Fabriken und unsere Autos
        Fabrik f = new TretAutoFabrik();

    // erzeugt Solarautos
        Fahrzeug fzg = f.erzeuge();

    // die ganz leise fahren
        fzg.move();

    // so bitte nach Möglichkeit NICHT programmieren
        //.....die konkrete SolarAutofabrik
        SolarAutoFabrik sf = new SolarAutoFabrik();

    // ....erzeugt lt. Definition Solarautos
        SolarAuto sFzg = (SolarAuto) sf.erzeuge();

    // und nun lassen wir das SolarAuto fahren
        sFzg.move();

    // alternativ kann das Fabrikmuster durch die Fabrikmethode ersetzt
        // werden
        //...die Fabrikmethode
        FabrikMethode fm = new FabrikMethode();

        // ...erzeugt ein Solarauto
        fzg = fm.erzeuge("solar");

        // ...das ganz leise fährt
        fzg.move();

    // Übungsaufgabe Spielen()
        SpielzeugLager szl = new RegalBrummbaer();
        Spielzeug sz = szl.nimmAusRegal();
        sz.spielen();

        SpielzeugFabrikMethode sfm = new SpielzeugFabrikMethode();
        sz = sfm.nimmAusRegal("Barbie");
        sz.spielen();

    //================================================================
   // Wir testen die Html-Fabrik
        // eine neue Tabellenfabrik
        Table t = new HtmlTable();

        // eine neue Html-Zeile
        Row r = new HtmlRow();

        // drei Html-Zellen für diese Zeile
        r.addCell(new HtmlCell("Zeile 1 / Spalte 1"));
        r.addCell(new HtmlCell("Zeile 1 / Spalte 2"));
        r.addCell(new HtmlCell("Zeile 1 / Spalte 3"));

        // wir fügen die neue Zeile zur Tabelle hinzu
        t.addRow(r);

        //...und geben das Ganze mal aus
        t.display();

    }

}
