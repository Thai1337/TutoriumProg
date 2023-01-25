public class Fuhrpark {

    // “Datenbank” mit ein paar Mitarbeiter und Kfz ...
    Mitarbeiter[] maListe = new Mitarbeiter[3];
    Kfz[] kfzListe = new Kfz[3];

    public Fuhrpark() {
        // "Datenbank" anlegen:
        maListe[0] = new Mitarbeiter("Mueller", 11);
        maListe[1] = new Mitarbeiter("Meier", 12);
        maListe[2] = new Mitarbeiter("Horst", 13);
// ... (weitere Mitarbeiter)
        kfzListe[0] = new Kfz("HB-A-1");
        kfzListe[1] = new Kfz("HB-B-2");
    }

    // ein paar “Hilfsmethoden” im Fuhrpark

    public Mitarbeiter gibMitarbeiter(int n){
        for (Mitarbeiter m : maListe)
            if (m.hatNr() == n) return m;

        /*Alternative
        for(int i = 0; i < maListe.length; i++)
            if (maListe[i].hatNr() == n) return maListe[i];
        */

        return null;
    }

    public Kfz gibFreiesKfz(){
        for (Kfz k : kfzListe)
            if (k.istVerfuegbar()) return k;
        return null;
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

