/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.objektklasse;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class KlasseDaMoody {
    private int meinWert;
    public KlasseDaMoody() {
        this.meinWert = 0;
    }
    public KlasseDaMoody(int meinWert){
        this.meinWert = meinWert;
    }
    
    // da uns die "Ausgabe" via Object.toString() missfällt, 
    //überschreiben wir diese Methode

    @Override
    public String toString() {
        
        return "Die Klasse " +this.getClass().getSimpleName() + " sagt: " + String.valueOf (this.meinWert) ;
    }

    @Override
    public boolean equals(Object obj) {
    
        // Reflexivität
        if ( this == obj )
            return true;
        
        // der Vergleich mit null muss false liefern
        if ( obj == null )
            return false;
        
        // test auf vergleichbarkeit
        if ( this.getClass() != obj.getClass() )
            return false;
        
        // Test **aller** Attribute
        if ( this.meinWert != ((KlasseDaMoody)obj).meinWert )
            return false;
        
        // nach dem Test aller Attribute steht die Gleichheit fest
        return true;
    }
         
    
    
    
}
