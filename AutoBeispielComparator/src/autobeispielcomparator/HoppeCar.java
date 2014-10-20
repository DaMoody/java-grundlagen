/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobeispielcomparator;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class HoppeCar {
    
    private int horsePower;
    private int mileage;
    
    public HoppeCar(){
        this.horsePower = 0;
        this.mileage = 0;
    }
    public HoppeCar(int horsePower, int milage){
        this.horsePower = horsePower;
        this.mileage = milage;
    }
    
    public int getHorsePower() {
        return horsePower;
    }

    public int getMileage() {
        return mileage;
    }
    
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " km: " + this.mileage + " ps: " + this.horsePower;
    }
    
}
