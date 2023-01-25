public class Mitarbeiter {
    String name;
    int gehalt;
    public Mitarbeiter(String n, int g){
        name = n; gehalt = g;
        IO.println(name+" ist dabei");
    }

    public boolean aendereGehalt(int gehaltDelta) {
        if (this.gehalt + gehaltDelta < 0) {
            return false;
        }
        this.gehalt += gehaltDelta;
        return true;
    }

    public void status(){
        IO.println(name+" Gehalt: "+gehalt);
    }
}
