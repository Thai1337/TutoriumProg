class Mitarbeiter {

    String name;
    int persoNr;
    boolean unterwegs = false;

    public Mitarbeiter(String n, int pnr) {
        name = n;
        persoNr = pnr;
    }

    public void printStatus(){
        IO.println("Mitarbeiter " + name
                + " (" + persoNr + ") ist "
                + ( unterwegs ? " unterwegs." : "da.") );
    }
    public void setzeUnterwegs(boolean status) {
        unterwegs = status;
    }

    public boolean istUnterwegs() {
        return unterwegs;
    }

    public int hatNr() {
        return persoNr;
    }

    public String hatName() {
        return name;
    }
}
