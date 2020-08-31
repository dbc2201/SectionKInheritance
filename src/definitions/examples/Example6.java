/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 29/08/20
 *  Time: 3:15 PM
 *  File Name : Example6.java
 * */
package definitions.examples;

public class Example6 {
    public static void main(String[] args) {
        Airplane myAirplane = new Airplane(1, 100);
        myAirplane.display();
        JetPlane myPrivateJet = new JetPlane(2, 25, 4);
        myPrivateJet.display();
    }
}

class Airplane {
    private final int airplaneID;
    private final int numberOfSeats;

    public Airplane(int airplaneID, int numberOfSeats) {
        this.airplaneID = airplaneID;
        this.numberOfSeats = numberOfSeats;
    }

    public int getAirplaneID() {
        return airplaneID;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void display() {
        System.out.println("airplaneID = " + airplaneID);
        System.out.println("numberOfSeats = " + numberOfSeats);
    }
}

class JetPlane extends Airplane {
    private final int numberOfEngines;

    public JetPlane(int airplaneID, int numberOfSeats, int numberOfEngines) {
        super(airplaneID, numberOfSeats);
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("airplaneID = " + getAirplaneID());
        System.out.println("numberOfEngines = " + numberOfEngines);
    }
}