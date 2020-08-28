/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 24/08/20
 *  Time: 11:55 AM
 *  File Name : Main.java
 * */
package main;

import definitions.MobilePhone;
import definitions.transport.FourWheeler;
import definitions.transport.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.travel("Agra");
        FourWheeler myFourWheeler = new FourWheeler();
        myFourWheeler.travel("Agra");
    }
}
