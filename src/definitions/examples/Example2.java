/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 29/08/20
 *  Time: 10:04 AM
 *  File Name : Example2.java
 * */
package definitions.examples;

public class Example2 {
    public static void main(String[] args) {

    }
}

class A {
    int j = 0;

    public void methodA(int k) {
        j = k;
        System.out.println("j = " + j);
    }
}
class B extends A {
    @Override
    public void methodA(int k) {
        j = k * k;
        System.out.println("j = " + j);
    }

    public void methodB() {
        System.out.println("Class B method.");
    }
}
class C extends A {
    @Override
    public void methodA(int x) {
        j = x * 5;
        System.out.println("j = " + j);
    }

    public void methodC() {
        System.out.println("Class C method.");
    }
}
class D {

}