public class Chef extends Mitarbeiter{
    public Chef(String name, int gehalt) {
        super(name, gehalt);
    }

    public void status() {
        IO.println(name+" Gehalt: geheim");
    }
}
