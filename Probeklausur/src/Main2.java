public class Main2 {
    public static void main(String[] args) {
        int[] vektor1 = { 1, 4, 3 };
        int[] vektor2 = { 1, 2, 3 };
        vektor1[1] = 2;
        if (vektor1 == vektor2) {
            IO.println("Die Arrays sind gleich.");
        }
        else {
            IO.println("Die Arrays sind nicht gleich.");
        }
        int a=1;
        int b=3-2;
        IO. println("a und b sind "+((a==b)?"gleich":"ungleich"));
    }
}
