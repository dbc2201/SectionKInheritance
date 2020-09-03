/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 03/09/20
 *  Time: 10:06 AM
 *  File Name : DynamicMethodDispatch.java
 * */
package definitions.dynamicMethodDispatch;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        bike1.display();
        RacingBike racingBike1 = new RacingBike();
        racingBike1.display();
        DeliveryBike deliveryBike1 = new DeliveryBike();
        deliveryBike1.display();

        Bike bike2 = racingBike1;
        // RacingBike newRacingBike = new Bike(); NOT ALLOWED
        bike2.display();
        bike2.refuel();
        // The reference variable of the parent class can call the methods
        // from the child class if and only if the methods were overridden
        // from the parent class.
    }
}

class Bike {
    public void display() { // #1
        System.out.println("Bike Class.");
    }

    public void refuel() {
        System.out.println("refueling...");
    }
}

class RacingBike extends Bike {
//    @Override
//    public void display() { // #2
//        System.out.println("RacingBike Class.");
//    }

    public void race() {
        System.out.println("racing...");
    }
}

class DeliveryBike extends Bike {
    @Override
    public void display() { // #3
        System.out.println("DeliveryBike Class.");
    }
}