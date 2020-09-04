/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 10:14 AM
 *  File Name : Example.java
 * */
package definitions.abstractClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example {
    public static void main(String[] args) {
        Watch watch = new Watch();
        watch.tellTime();
        SportsWatch sportsWatch = new SportsWatch();
        sportsWatch.tellTime();
    }
}

class Watch {
    public void tellTime() {
        System.out.println(LocalDateTime.now());
    }
}

class SportsWatch extends Watch {
    @Override
    public void tellTime() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
}

class FancyWatch extends Watch {

}
