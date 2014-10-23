/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.patterns.abstraktefabrik;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class HtmlTableFactory extends TableFactory{

    @Override
    public Table createTable() {
       return new HtmlTable();
    }

    @Override
    public Row createRow() {
        return new HtmlRow();
    }

    @Override
    public Cell createCell(String content) {
        
        return new HtmlCell(content);
    }

    
   
    
}
