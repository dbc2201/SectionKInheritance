/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 07/09/20
 *  Time: 11:17 AM
 *  File Name : YouTuber.java
 * */
package definitions.interfaces;

public interface YouTuber {

    // this is not the default visibility modifier!
    // this is a special keyword
    // here, it means the default implementation of the method.
    // These default, static and private methods were included after Java 9
    default void createAccount() {
        signUp();
        createBrandName();
        createAlbumArt();
        uploadPicture();
    }

    private void uploadPicture() {

    }

    default String getBrandName() {
        return "";
    }

    private void createAlbumArt() {

    }

    private void signUp() {

    }

    static void createBrandName() {

    }

    void createVideo();
}

class Divyansh implements YouTuber {
    @Override
    public void createVideo() {
        System.out.println("creating videos...");
    }
}

class Abhishek implements YouTuber {
    @Override
    public void createVideo() {
        System.out.println("Compile Funny Videos...");
    }
}
