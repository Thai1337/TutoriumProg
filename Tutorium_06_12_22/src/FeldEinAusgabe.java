public class FeldEinAusgabe {


    int rows;
    int columns;
    int koordX;
    int koordY;
    char koordJN = 'j';
    char[][] feld;

    void einlesen() {

        System.out.println("Wie hoch soll dein Spielfeld sein?");
        rows = IO.readInt();
        while (rows <= 0) {
            System.out.println("Bitte gib eine Zahl ein, die größer als 0 ist.");
            rows = IO.readInt();
        }
        System.out.println("Wie breit soll dein Spielfeld sein?");
        columns = IO.readInt();
        while (columns <= 0) {
            System.out.println("Bitte gib eine Zahl ein, die größer als 0 ist.");
            columns = IO.readInt();
        }

        feld = new char[rows][columns];


        System.out.println("Bitte gib eine x-Koordinate ein, die sowohl größer als 0 ist, als auch im Spielfeld liegt.");
        koordX = IO.readInt();
        while (koordX < 0 || koordX >= columns) {
            System.out.println("Deine x-Koordinate war nicht größer als 0. Versuche es erneut.");
            koordX = IO.readChar();
        }
        System.out.println("Bitte gib eine y-Koordinate ein, die sowohl größer als 0 ist, als auch im Spielfeld liegt.");
        koordY = IO.readInt();
        while (koordY <= 0) {
            System.out.println("Deine y-Koordinate war nicht größer als 0. Versuche es erneut.");
            koordY = IO.readChar();
        }

        feld[koordX][koordY] = 'x';



        System.out.println("Danke fürs mitspielen!");



    }

    void ausgeben() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (feld[i][j] != 'x') {
                    feld[i][j] = '.';
                }
                System.out.print(feld[i][j]);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FeldEinAusgabe spielfeld = new FeldEinAusgabe();
        spielfeld.einlesen();
        spielfeld.ausgeben();

    }
}
