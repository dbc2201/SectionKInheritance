/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 10:28 AM
 *  File Name : Difference.java
 * */
package definitions.abstractClasses;

public class Difference {
    public static void main(String[] args) {

    }
}

abstract class Human {
    abstract public void talk();
    abstract public void walk();
    abstract public void eat();
    abstract public void breathe();

    public void sleep() {
        System.out.println("I am sleeping...");
    }

}

class Student extends Human {

    @Override
    public void talk() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void breathe() {

    }
}
