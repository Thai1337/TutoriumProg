public class Mitarbeiter extends Nutzer{
    double gehalt;
    public Mitarbeiter(int nummer, String name, double gehalt) {
        super(nummer, name);
        this.gehalt = gehalt;
    }

    @Override
    public void printStatus() {
        System.out.println("Mitarbeiter: " + nummer + " Name: " + name + " | Gehalt: " + gehalt);
    }
}
