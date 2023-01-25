public class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super("Anmeldung Fehlgeschlagen: " + message);
    }
}
