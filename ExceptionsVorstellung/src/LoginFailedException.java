public class LoginFailedException extends IllegalArgumentException {
    public LoginFailedException(String message) {
        super("Anmeldung Fehlgeschlagen: " + message);
    }
}
