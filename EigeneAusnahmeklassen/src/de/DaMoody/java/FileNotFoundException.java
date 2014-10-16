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
public class FileNotFoundException extends IOException {
    
    public FileNotFoundException(String message) {
        super(message);
    }
}
