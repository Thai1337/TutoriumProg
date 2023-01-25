public class Konkat {
    public static void main(String[] args) {
        char[] x = {'U', 's', 'c'}, y = {'h', 'i'};
        char[] z = verbinden(x, y);
        System.out.println(z);
    }

    public static char[] verbinden(char[] f1, char[] f2) {
        char[] result = new char[f1.length + f2.length];

        for (int i = 0; i < f1.length; i++) {
            result[i] = f1[i];
        }

        for (int i = 0; i < f2.length; i++) {
            result[i + f1.length] = f2[i];
        }



        return result;
    }
}
