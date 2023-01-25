public class PersonalMg {
    Mitarbeiter[] dieLeute;
    public PersonalMg (){
        dieLeute = new Mitarbeiter[10];
    }
    public void einstellen (Mitarbeiter m, int i){
        this.dieLeute[i] = m;
    }
    public void printAlle(){
        for (int i=0; i<10; i++)
            if (dieLeute[i]!=null) dieLeute[i].status();
    }

    public boolean neuesGehalt (int gehaltsAenderung) {
        for (Mitarbeiter mitarbeiter : dieLeute) {
            if(mitarbeiter != null && !mitarbeiter.aendereGehalt(gehaltsAenderung)) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] arg){
        PersonalMg a = new PersonalMg();
        a.einstellen( new Mitarbeiter("Horst", 1400), 1);
        a.einstellen( new Chef("Elke", 2000), 4);
        a.neuesGehalt(100);
        a.printAlle();
    }
}
