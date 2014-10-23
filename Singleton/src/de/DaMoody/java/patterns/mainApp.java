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
        // eine neue Tabellenfabrik  (test)
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

        
        // HtmlFabrik neu
        
        String[][] data = new String[9][2];
        
        data[0][0] = "1";
        data[0][1] = "Borrmann";
        data[1][0] = "2";
        data[1][1] = "Köcher";
        data[2][0] = "3";
        data[2][1] = "Bahr";
        data[3][0] = "4";
        data[3][1] = "Steinhagen";
        data[4][0] = "5";
        data[4][1] = "Hoppe";
        data[5][0] = "6";
        data[5][1] = "Uhlemann";
        data[6][0] = "7";
        data[6][1] = "Bertram";
        data[7][0] = "8";
        data[7][1] = "Stabenow";
        data[8][0] = "9";
        data[8][1] = "schlupp";
        
        // wir erzeugen den neuen CLient und injezieren die HtmlTableFactory
        TabellenClient tc = new TabellenClient(new HtmlTableFactory());
        
        // ..und der Tanbellenclient soll jetzt unsere Daten augeben
        tc.showData(data);
        
    
    }

}
