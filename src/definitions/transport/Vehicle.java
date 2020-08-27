/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 10:09 AM
 *  File Name : Vehicle.java
 * */
package definitions.transport;

public class Vehicle { // parent class ? or a child class ?
    public void travel() {
        // So, how can we polymorph this method?
        // - we can either change the number of parameters
        // - or, we can change the type of the parameters
        System.out.println("Vehicle is travelling to Delhi.");
    }

    // This is a polymorphic method.
    // The proper name is : Method Overloading,
    // The concept is just the same, we have only discovered the proper name for it.
    // This travel() method is overloaded.
    // This is an overloaded version of the travel() method.
    public void travel(String destination) {
        System.out.println("Vehicle is travelling to " + destination + ".");
    }

}

// Vehicle <- (is inherited by) FourWheeler
// The Vehicle.java class is the parent class of the FourWheeler.java class.
// The FourWheeler.java class is the child class of the Vehicle.java class.

// Since, there is no other class to relate this class to,
// we cannot say right now that whether this class is a parent class
// or a child class.

// This class will only become a parent class when it has a child class!

// Right now, this is just a simple definition class. okay?

// Now, we can doubt whether this class is a parent class.