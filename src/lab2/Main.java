package lab2;

//inmultire, impartire, restul impartirii
public class Main {

    public static void main(String[] args) {
        double div = div(69, 4);
        System.out.println(div);
        int mult = mult(3, 9);
        System.out.println(mult);
        int mod = mod(69,4);
        System.out.println(mod);
    }


    public static int mult(int first, int second) {
        int mult = first * second;
        return mult;

    }

    public static double div(int var1, int var2) {
        int div = var1 / var2;
        return div;
    }

    public static int mod(int num1, int num2) {
        int mod = (num1 %= num2);
        return mod;
    }

}
