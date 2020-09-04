/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 10:14 AM
 *  File Name : Example.java
 * */
package definitions.abstractClasses;

import java.time.LocalDateTime;

public class Example {
    public static void main(String[] args) {

    }
}

class Watch {
    public void tellTime() {
        System.out.println(LocalDateTime.now());
    }
}

class SportsWatch extends Watch {

}
