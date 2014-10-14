/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objektklasse;

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
    
}
