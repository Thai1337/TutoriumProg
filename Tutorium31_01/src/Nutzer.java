public abstract class Nutzer {
    protected int nummer;
    protected String name;
    public Nutzer(int nummer, String name) {
        this.nummer = nummer;
        this.name = name;
    }

    public int getNummer() {
        return nummer;
    }

    public String getName() {
        return name;
    }

    public abstract void printStatus();
}
