public class Main {
    public static void main(String[] args){

        int a=9,b=4,c=7,d=1,e=3;

        while((a=1)==1 && (b=2)==3 && (c=3)==3 || (d=4)==4 || (e=5)==7){
            System.out.println(a + "" + b + "" + c + "" +d + "" + e);
            break;
        }
    }

    public static int maxi(int z1, int z2, int z3) {
        if (z1 >= z2 && z1 >= z3) {
            return z1;
        }else if (z2 >= z1 && z2 >= z3) {
            return z2;
        }else {
            return z3;
        }
    }


    public static int maxi2(int z1, int z2, int z3) {
        if (z1 >= z2 && z1 >= z3) {
            return z1;
        }
        if (z2 >= z1 && z2 >= z3) {
            return z2;
        }
        return z3;
    }

    public static int maxi3(int z1, int z2, int z3) {
        int maxiTry = z1 > z2 ? z1 : z2;
        int maxi = maxiTry > z3 ? maxiTry : z3;
        return maxi;
    }


}
