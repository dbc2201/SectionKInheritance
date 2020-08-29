/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 29/08/20
 *  Time: 3:02 PM
 *  File Name : Example5.java
 * */
package definitions.examples;

public class Example5 {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.modelNumber = 12;
        myBike.modelYear = 2020;
        myBike.display();
        SuperBike mySuperBike = new SuperBike();
    }
}

class Bike {
    int modelNumber;
    int modelYear;

    void display() {
        System.out.println("modelNumber = " + modelNumber);
        System.out.println("modelYear = " + modelYear);
    }
}

class SuperBike extends Bike {
    int maxSpeed;

    @Override
    void display() {
        System.out.println("modelNumber = " + modelNumber);
        System.out.println("modelYear = " + modelYear);
        System.out.println("maxSpeed = " + maxSpeed);
    }
}
