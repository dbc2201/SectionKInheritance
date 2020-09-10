/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 07/09/20
 *  Time: 11:34 AM
 *  File Name : Cheating.java
 * */
package definitions.interfaces;

public interface Cheating {
    public abstract void cheat(); // default, private, static are exceptions
}

abstract class Proxy {
    public abstract void markProxyAttendance();

    void askFriendIfTheyCanMarkMyProxy(String friendName) {
        System.out.println("Oye " + friendName + ", bhai proxy laga de yaaaaaarr.....");
    }

}

class TestCheating implements Cheating {
    @Override
    public void cheat() {
        System.out.println("ask answer from student sitting in front.");
    }
}

class OnlineTestCheating implements Cheating {
    @Override
    public void cheat() {
        System.out.println("......");
    }
}
