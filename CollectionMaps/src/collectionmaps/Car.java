/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionmaps;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class Car {
    
    private int id;
    private int mileage;
    private int horsepower;
    
    public Car(){
        
    }

    public Car(int id, int mileage, int horsepower) {
        this.id = id;
        this.mileage = mileage;
        this.horsepower = horsepower;
    }
    
    public int getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +" " + this.id + " (km: " + this.mileage +" PS: " + this.horsepower + ")";
    }
    
    



}
