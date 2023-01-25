public class Test {
    public static void main(String[] args) {
        char a = 'b';

        int koordX = IO.readInt();
        int columns = 5;

        while(koordX < 0 || koordX >= columns) {
            System.out.println("Hi");
            koordX = IO.readInt();
        }


    }
}
