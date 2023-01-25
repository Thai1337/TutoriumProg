public class Auto {
    String farbe;
    String marke;
    int motorleistung;
    int aktuelleGeschwindigkeit;

    public Auto(String f, String m, int motorL) {
        farbe = f;
        marke = m;
        motorleistung = motorL;
        aktuelleGeschwindigkeit = 0;
    }

    public void beschleunigen(){
        System.out.println("Ich beschleunige...");
        aktuelleGeschwindigkeit += 30;
    }

    public void bremsen(){
        System.out.println("Ich bremse...");
        aktuelleGeschwindigkeit -= 30;
    }

    public void gibDetails(){
        System.out.println("Marke: " + marke
                +", Farbe: " + farbe
                +", Motorleistung: " + motorleistung);
        System.out.println("Aktuelle Geschwindigkeit: " + aktuelleGeschwindigkeit);
    }


    public static void main(String[] args) {









        Auto auto1 = new Auto("grün", "porsche", 480);

        Auto auto2 = new Auto("schwarz", "fiat", 280);

        auto1.beschleunigen();
        auto1.beschleunigen();
        auto1.bremsen();

        auto1.gibDetails();

        System.out.println("");

        auto2.gibDetails();

    }
}

