public class Rechner {
    double zahl1; // double zahl1 = 0;
    double zahl2;
    double ergebnis;
    char operator;



    void einlesen() {
        IO.println("Tipp zwei Zahlen");
        zahl1 = IO.readDouble();
        zahl2 = IO.readDouble();
        operator = IO.readChar();
    }

    boolean berechnen() {
        ergebnis = zahl1 * zahl2; // switch case
        return false;
    }

    void ausgeben() {
        System.out.println(ergebnis);

    }
    public static void main(String[] args) {
        Rechner taschenrechner = new Rechner();
        taschenrechner.einlesen();
        taschenrechner.berechnen();
        taschenrechner.ausgeben();

    }
}