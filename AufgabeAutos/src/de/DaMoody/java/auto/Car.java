/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DaMoody.java.auto;

/**
 *
 * @author Danny Borrmann <Danny_Borrmann@web.de>
 */
public class Car implements Vehicle {

    private boolean engineStatus;
    private int milage;

    public Car() {

        this.engineStatus = false;
        this.milage = 0;
    }

    public Car(boolean engineStatus, int milage) {

        this.engineStatus = engineStatus;
        this.milage = milage;
    }

    @Override
    public void startEngine() {

        this.engineStatus = true;
    }

    @Override
    public void stopEngine() {

        this.engineStatus = false;
    }

    @Override
    public void move(int distance) {

        if (!this.engineStatus) {
            this.engineStatus = true;
        }
        if (distance < 0) {

            // throw new FerrisMachtBlauException("so nicht!");
        }
        this.milage += distance;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.milage;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        if (this.milage != ((Car) obj).milage) {
            return false;
        }

        if (this.engineStatus != ((Car) obj).engineStatus) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {

        int prim = 37;
        int start = 19;

        int result = prim * start + ((this.engineStatus) ? 1 : 0);
        result = prim * start + this.milage;

        return result & 0x7ffffff;
    }

}
