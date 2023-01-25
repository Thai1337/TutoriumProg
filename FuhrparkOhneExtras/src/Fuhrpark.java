public class Fuhrpark {

    // “Datenbank” mit ein paar Mitarbeiter und Kfz ...
    Mitarbeiter m1, m2, m3;
    Kfz k1, k2;


    public Fuhrpark() {
        m1 = new Mitarbeiter("Mueller", 11);
        m2 = new Mitarbeiter("Meier",   12);
        m3 = new Mitarbeiter("Horst",   13);
        // ... (weitere Mitarbeiter)
        k1 = new Kfz("HB-A-1");
        k2 = new Kfz("HB-B-2");

    }

    // ein paar “Hilfsmethoden” im Fuhrpark

    public Mitarbeiter gibMitarbeiter(int n){
        if (m1.hatNr() == n) return m1;
        if (m2.hatNr() == n) return m2;
        if (m3.hatNr() == n) return m3;
        else return null;
    }

    public Kfz gibFreiesKfz(){
        if (k1.istVerfuegbar()) return k1;
        else if (k2.istVerfuegbar()) return k2;
        else return null;
    }


    public Fahrt fahrtAntreten(Kfz k, Mitarbeiter m, int tag) {
        if (!m.istUnterwegs() && k.istVerfuegbar()) {
            Fahrt dienstFahrt = new Fahrt(k, m, tag);
            return dienstFahrt;
        }
        return null;
    }

    public Rechnung fahrtAbrechnen(Fahrt f, int heute) {
        // Fahrt beenden
        f.beenden(heute);

        // Rechnung erstellen
        int      tage = f.hatDauer();
        Mitarbeiter m = f.hatMitarbeiter();
        Rechnung   re = new Rechnung(m.hatName(), tage);
        return re;
    }

    // Klasse Fuhrpark dient als Hauptprogramm:
    public static void main(String[] args) {
        Fuhrpark fuhrpark = new Fuhrpark();

        // Testlauf mit festem Mitarbeiter und kfz:
        Kfz k         = fuhrpark.gibFreiesKfz();
        Mitarbeiter m = fuhrpark.gibMitarbeiter(12);
        Fahrt f       = fuhrpark.fahrtAntreten(k, m, 3);
        if (f != null)
            IO.println("Hat geklappt, los geht's!");
        else
            IO.println("Das hat leider nicht funktioniert!");
        m.printStatus();     // ist jetzt unterwegs
        k.printStatus();     // ist jetzt unterwegs

        // Mitarbeiter 12 ist am 7.Tag zurueck
        Rechnung re = fuhrpark.fahrtAbrechnen(f, 7);
        re.printStatus();
        m.printStatus();
        k.printStatus();
    }
}

