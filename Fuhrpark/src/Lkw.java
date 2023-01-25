public class Lkw extends Kfz{

    int zulaessigeZuladung = 0;

    public Lkw(String kennz) {
        super(kennz);
    }

    public void beladen(int gewicht) {
        /* Erhöhung der Beladung bis max. zulässige Zuladung */
        zulaessigeZuladung += gewicht;
    }
    public void entladen(int gewicht) {
        /* Reduzierung der Beladung */
        zulaessigeZuladung -= gewicht;
    }

    public void printStatus() {
        IO.println("Lkw Kennzeichen "+kennzeichen+" ist"+ ( (verfuegbar) ? " da." : " unterwegs." + " Mit einer Zuladung von: " + zulaessigeZuladung));
    }
}
