/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 10:21 AM
 *  File Name : Car.java
 * */
package definitions.transport;

// from common knowledge, we know that,
// A Car IS A type of Vehicle, and
// A Car IS A type of FourWheeler also, right?
public class Car extends FourWheeler {

}

// So, that becomes,
// FourWheeler <- (is inherited by) Car
// The FourWheeler.java class is now the parent class of the Car.java class.
// The Car.java class is now the child class of the FourWheeler.java class.
// but, we also know that,
// Vehicle <- (is inherited by) FourWheeler
// So, the FourWheeler.java class is the child class of the Vehicle.java class.
// & the Vehicle.java class is the parent class of the FourWheeler.java class.

// Vehicle <- (is inherited by) FourWheeler <- (is inherited by) Car
// The Vehicle.java class is the parent class of the FourWheeler.java class.
// The FourWheeler.java class is the child class of the Vehicle.java class.
// & The FourWheeler.java class is also the parent of the Car.java class.
// The Car.java class is the child class of the FourWheeler.java class.
// Vehicle (grandparent) <- FourWheeler (parent) <- Car (child)
// This is an example of multi-level inheritance.

// Vehicle <- (is inherited by) Car
// The Vehicle.java class is now the parent class of the Car.java class.
// The Car.java class is now the child class of the Vehicle.java class.

// But, we also know, that
// Vehicle <- (is inherited by) FourWheeler also
// The Vehicle.java class is also the parent class of the FourWheeler.java class.
// and the FourWheeler.java class is also a child class of the Vehicle.java class,
// just like the Car.java class.

// So, the complete hierarchy, becomes:
// Vehicle <- (is inherited by) FourWheeler & Car
// The Vehicle.java class is the parent class of the FourWheeler.java class.
// The FourWheeler.java class is the child class of the Vehicle.java class.
// The Vehicle.java class is also the parent class of the Car.java class.
// The Car.java class is also the child class of the the Vehicle.java class.
// Parent: Vehicle <- Child (two): FourWheeler, Car

// Vehicle <- FourWheeler & Car
// OR
// Vehicle <- FourWheeler
// Vehicle <- Car

// Right now, this Car.java class is not related to any other class in this package.
// It is simply just a definition class by itself.

// It will become a parent class OR a child class only when we use the `extends`
// keyword.
