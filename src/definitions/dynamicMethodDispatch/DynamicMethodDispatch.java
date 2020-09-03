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
    }
}

class Bike {
    public void display() { // #1
        System.out.println("Bike Class.");
    }
}

class RacingBike extends Bike {
    @Override
    public void display() { // #2
        System.out.println("RacingBike Class.");
    }
}

class DeliveryBike extends Bike {
    @Override
    public void display() { // #3
        System.out.println("DeliveryBike Class.");
    }
}