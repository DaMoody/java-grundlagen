/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobeispielcomparator;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class AutoBeispielComparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoppeCar steini = new HoppeCar(0,0);
        System.out.println(steini);
        
        HoppeCar moody = new HoppeCar(1000,0);
        System.out.println(moody);
    
        TreeSet<HoppeCar> thcMileage = new TreeSet<>(new MileageComparator());
        
        thcMileage.add(new HoppeCar(0,0));
        thcMileage.add(new HoppeCar(10,40));
        thcMileage.add(new HoppeCar(20,30));
        thcMileage.add(new HoppeCar(30,20));
        thcMileage.add(new HoppeCar(40,10));
    
        for (HoppeCar hc : thcMileage) {
            
            System.out.println(hc);
        }
        System.out.println("---reverse---");
        Iterator<HoppeCar> itHc = thcMileage.descendingIterator();
        while( itHc.hasNext()){
            System.out.println(itHc.next());
        }
        
        TreeSet<HoppeCar> thcHorsePower = new TreeSet<>(new HorsePowerComparator());
       
        thcHorsePower.add(new HoppeCar(100,500));
        thcHorsePower.add(new HoppeCar(200,400));
        thcHorsePower.add(new HoppeCar(300,300));
        thcHorsePower.add(new HoppeCar(400,200));
        thcHorsePower.add(new HoppeCar(500,100));
        
        for (HoppeCar hc : thcHorsePower) {
            
            System.out.println(hc);
        }
        System.out.println("---reverse---");
        Iterator itHcA = thcHorsePower.descendingIterator();
        
        while( itHcA.hasNext()){
            System.out.println(itHcA.next());
        }
        
        
        
    
    
    }
    
}
