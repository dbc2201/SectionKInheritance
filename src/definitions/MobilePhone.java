/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 24/08/20
 *  Time: 11:50 AM
 *  File Name : MobilePhone.java
 * */
package definitions;

public class MobilePhone extends Phone {
    public void printContactNumber() {
        System.out.println(getContactNumber());
    }
}

// We have created a Phone (the instrument).
// To model this in our program, we have created Phone.java
// contactNumber

// Now, the technology has advanced and engineers have created a mobile phone.
// To model this in our program, we have created MobilePhone.java
// contactNumber
// ... more advanced technology

// A mobile phone is a type of phone.