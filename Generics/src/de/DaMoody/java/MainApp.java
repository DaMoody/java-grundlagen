package de.DaMoody.java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MeineBox mb = new MeineBox();
        
        mb.set(100);
        
        System.out.println(mb.get());
        
        mb.set("Hallo");
        
        System.out.println(mb.get());
        
        MeineBox<String> mbString = new MeineBox<String>();
        
        mbString.set("Hallo");
        System.out.println(mbString.get());
        
        //führt zu einem Fehler, da die mbstring-Box nur noch Ziechenketten akzeptiert
        //mbString.set(100);
        
        MeineBox<Integer> mbInt = new MeineBox<>();
        MeineBox rawBox = mbInt;
        MeineBox mbA = new MeineBox();
        MeineBox<Integer> mbIntA = mbA;
        
        
        MeineBox<Integer> mBoxA = new MeineBox<>();
        MeineBox<Integer> mBoxB = new MeineBox<>();
        MeineBox<String>  mBoxC = new MeineBox<>();
        
        mBoxA.set(100);
        mBoxB.set(100);
        mBoxC.set("100");
        
        System.out.println( eineAndereBox.<Integer>vergleiche(mBoxA, mBoxB));
        //System.out.println( eineAndereBox.<Integer>vergleiche(mBoxB, mBoxC));
    
        //===================================================================
        
        NochEineAndereBox<Integer> neabi = new NochEineAndereBox<>();
        NochEineAndereBox<Byte> neabb = new NochEineAndereBox<>();
        
        //NochEineAndereBox<String> neabs = new NochEineAndereBox<>();
        // String ist nich zulässig
        
        neabi.set(new Integer(10));
        neabb.set(new Byte("10"));
        
        neabi.untersuche( new Integer (2000));
        neabb.untersuche( new Byte("20"));
    
    }
    
}
