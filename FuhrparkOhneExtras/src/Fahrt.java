class Fahrt {

    Mitarbeiter mitarbeiter;
    Kfz fahrzeug;
    int startTag = 0;
    int endTag = 0;

    public Fahrt(Kfz k, Mitarbeiter m, int heute) {
        fahrzeug = k;
        mitarbeiter = m;
        startTag = heute;
        // Mitarbeiter und Fahrzeug sind ab jetzt unterwegs
        mitarbeiter.setzeUnterwegs(true);
        fahrzeug.setzeVerfuegbarkeit(false);
    }
    public void beenden(int heute) {
        endTag = heute;
        // Mitarbeiter ist wieder zuhause ...
        mitarbeiter.setzeUnterwegs(false);
        // ... und Kfz wieder verfügbar
        fahrzeug.warten();
        fahrzeug.setzeVerfuegbarkeit(true);
    }

    public int hatDauer() {
        if (endTag < startTag)
            return 365+endTag-startTag; //max. 364 Tage unterwegs!
        else
            return (endTag-startTag);
    }

    public Mitarbeiter hatMitarbeiter() {
        return mitarbeiter;
    }
}
