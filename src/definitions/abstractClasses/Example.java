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
        SportsWatch sportsWatch = new SportsWatch();
        sportsWatch.tellTime();
        FancyWatch fancyWatch = new FancyWatch();
        fancyWatch.tellTime();
    }
}

abstract class Watch {
    abstract public void tellTime();
    // abstract means something that is not properly defined.
    // this tellTime() method is now an abstract method.
    // abstract methods are those method whose bodies are not defined properly.
    // since this method is now an abstract method,
    // the class should also be declared as an abstract class.
    // in the case of abstract classes, overriding is called implementing
}

class SportsWatch extends Watch {
    @Override
    public void tellTime() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
}

class FancyWatch extends Watch {
    @Override
    public void tellTime() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME));
    }
}

class MilitaryWatch extends Watch {
    @Override
    public void tellTime() {

    }
}
