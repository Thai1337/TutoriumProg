class Rechnung {

    int     anzahlTage; // Anzahl Tage, die Mitarbeiter weg war
    String  name;

    public Rechnung (String name, int tage) {
        this.name = name;
        anzahlTage = tage;
    }

    public void printStatus() {
        IO.println("Rechnung ueber " + anzahlTage
                + " Tage fuer Mitarbeiter " + name );
    }
}