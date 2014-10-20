/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.collectionframework;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steffen Bauer <schlupp2014@gmail.com>
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Und warum ist das so?
        List<Integer> intListe = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            intListe.add((int) (Math.random() * 100));
        }
// in einer Art foreach-Schleife wollen wir die Listenelemente ausgeben
        for (Integer element : intListe) {
            System.out.println(element);
        }
// Prüfen, ob die Liste leer ist
        System.out.println("Die Liste ist leer: " + intListe.isEmpty());
// Prüfen, ob ein Wert in der Liste ist
        intListe.add(10);
        System.out.println("Die Liste enthält den Wert 10: " + intListe.contains(10));
// die Größe der Liste ausgeben
        System.out.println("Die Liste hat " + intListe.size() + " Elemente");
// das erste Element der Liste entfernen
        intListe.remove(0);
        System.out.println("Die Liste hat " + intListe.size() + " Elemente");
// eine Teilliste extrahieren
        List<Integer> subList = intListe.subList(0, 5);
        for (Integer element : subList) {
            System.out.println(element);
        }
    }
}
