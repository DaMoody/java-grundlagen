/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java;

import java.io.IOException;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class DemoKlasseB {
    
    /**
     * 
     * @throws Exception
     * @throws IOException 
     */
    
    public void ichWerfeWas() throws Exception, IOException {
        
        String s = new String(" I'm not doing shit today! ");
        
        if (s==null)
        throw new Exception("Lirum Larum");
        
        throw new IOException("Nur mal ein Test");
    }
}
