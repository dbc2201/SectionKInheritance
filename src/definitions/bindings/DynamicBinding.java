/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 31/08/20
 *  Time: 11:24 AM
 *  File Name : DynamicBinding.java
 * */
package definitions.bindings;

public class DynamicBinding {
    public static void main(String[] args) {
        Airplane myAirplane = new Jet();
        // object reference is from the child class
        // the reference variable is from the parent class
        // We can store the reference value of an object of the child class,
        // inside the reference variable of its parent class, but not vice-versa.
        myAirplane.display();
    }
}

class Airplane {
    public void display() {
        System.out.println("Airplane class.");
    }
}

class Jet extends Airplane {
    @Override
    public void display() {
        System.out.println("Jet class.");
    }

    public void displayFuelStatus() {
        System.out.println("Sufficient fuel remaining.");
    }
}
