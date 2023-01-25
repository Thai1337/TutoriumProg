import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        try {
            validateLogin("Tom", "DieProgKlausurWirdSuper");
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }
    }

    //schritt 1 methode erstellen
    private static void validateLogin(String username, String password) throws LoginFailedException {
        if(username.equals("") || password.equals("")) { //schritt 2 bedingung
            throw new LoginFailedException("Bitte füllen Sie beide Felder aus"); //schritt 3 Exception erstellen | schritt 4 ist die Exception throw
        }

        //schritt 4
        if(!username.equals("Tom") || !password.equals("DieProgKlausurWirdSuper")) {
            throw new LoginFailedException("Benutzername oder passwort falsch");
        }

    }

}
