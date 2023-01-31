public class Main {
    public static void main(String[] args) {

        Kunde k1 = new Kunde(1, "John", "Bremen");
        Kunde k2 = new Kunde(2, "Ben", "Hamburg");
        Kunde k3 = new Kunde(3, "Max", "Berlin");

        Mitarbeiter m1 = new Mitarbeiter(4, "Niko", 12.28);
        Mitarbeiter m2 = new Mitarbeiter(5, "Jan", 30.2);

        Nutzer[] nutzer = new Nutzer[5];
        nutzer[0] = k1;
        nutzer[1] = k2;
        nutzer[2] = k3;
        nutzer[3] = m1;
        nutzer[4] = m2;

        for (Nutzer n: nutzer) {
            n.printStatus();
        }

    }
}
