import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hallo");

        try {
            validateLogin("Tom", "Tom123");
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }


    }

    private static void validateLogin(String username, String password) throws LoginFailedException {
        if(username.equals("") || password.equals("")) {
            throw new LoginFailedException("Eingabefeld leer");
        }

        if(!username.equals("Tom") || !password.equals("Tom123")) {
            throw new LoginFailedException("Benutzername oder Passwort Ungueltig");
        }
    }
}
