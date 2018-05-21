/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author nebojsa
 */
public class Car {
    
    
    int maxSpeed = 120;
    int minSpeed = 40;
    double weight = 1200;
    boolean isTheCarOn = false;
    char condition = 'A';
    
    
    public void printVariables() {
        System.out.println("Maksimalna Brzina: " + maxSpeed);
        System.out.println("Minimalna Brzina; " + minSpeed);
        System.out.println("Tezina: " + weight);
        System.out.println("Pokrenut: " + isTheCarOn);
        System.out.println("Stanje: " + condition);
    }
    
    public void changeMaxSpeed() {
        maxSpeed = 130;
    }
    
    public void changeMinSpeed() {
        minSpeed = 50;
    }
    
    public void changeWeight() {
        weight = 1150;
    }
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car myCar = new Car ();
        myCar.printVariables();
        myCar.changeMaxSpeed();
        myCar.changeMinSpeed();
        myCar.changeWeight();
        myCar.printVariables();
    }
    
}
