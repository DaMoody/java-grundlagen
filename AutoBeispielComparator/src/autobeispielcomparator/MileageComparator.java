/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobeispielcomparator;

import java.util.Comparator;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class MileageComparator implements Comparator<HoppeCar>{

    @Override
    public int compare(HoppeCar o1, HoppeCar o2) {
      
        return o1.getMileage() - o2.getMileage();
    }
    
    
    
}
