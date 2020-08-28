/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 10:18 AM
 *  File Name : Example1.java
 * */
package definitions.examples;

// If we create a public class then,
// the name of the public class and
// the name of the file it is declared in
// should be exactly the same!

public class Example1 {
    public static void main(String[] args) {
        DemoA objectA = new DemoA();
        objectA.display();
        objectA.printClassName();
        DemoB objectB = new DemoB();
        objectB.display();
        objectB.printClassName();
    }
}
class DemoA {
    public void display() {
        System.out.println("Class DemoA Method.");
    }
    public void printClassName() {
        System.out.println(this.getClass().getName());
    }
}
class DemoB extends DemoA {

}