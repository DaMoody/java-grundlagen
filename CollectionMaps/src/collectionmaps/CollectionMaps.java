/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionmaps;

import java.util.HashMap;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class CollectionMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Car dummy = new Car(1, 0, 200);

        System.out.println(dummy);
        HashMap<Integer, Car> hmCar = new HashMap<>();

        for (int i = 0; i < 20; i++) {
            hmCar.put(i, new Car(i, 0, i * 100));
        }
        for (Integer i : hmCar.keySet()) {
            System.out.println(hmCar.get(i));
        }

    }

}
