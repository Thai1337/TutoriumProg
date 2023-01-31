public class Kunde extends Nutzer{
    String adresse;
    public Kunde(int nummer, String name, String adresse) {
        super(nummer, name);
        this.adresse = adresse;
    }

    @Override
    public void printStatus() {
        System.out.println("Kunde: " + nummer + " Name: " + name + " | Adresse: " + adresse);
    }


}
