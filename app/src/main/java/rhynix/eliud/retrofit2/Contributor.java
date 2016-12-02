package rhynix.eliud.retrofit2;

/**
 * Created by eliud on 12/2/16.
 */

public class Contributor {

    String login;
    String html_url;

    int contributions;


    @Override
    public String toString() {
        return login + "(" + contributions + ")";
    }
}
