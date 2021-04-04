package lab2;

//inmultire, impartire, restul impartirii
public class Main {

    public static void main(String[] args) {
        double div = div(69, 4);
        System.out.println(div);
        int mult = mult(3, 9);
        System.out.println(mult);
        int mod = mod(69, 4);
        System.out.println(mod);
        int plus = plus(10, 8);
        System.out.println(plus);
        int sub = sub(78, 43);
        System.out.println(sub);
        int media = media(15, 58, 97);
        System.out.println(media);
        double celsius = celsius(198);
        System.out.println(celsius);
        double inch = inch(10);
        System.out.println(inch);
        int speedinmps = speedinmps(5762,0,5,7);
        System.out.println(speedinmps);
        int speedinkph = speedinkph(78524,5);
        System.out.println(speedinkph);
        int speedinmph = speedinmph(4579,2);
        System.out.println(speedinmph);
    }

    //Inmultire
    public static int mult(int first, int second) {
        int mult = first * second;
        return mult;

    }

    //Impartire
    public static double div(int var1, int var2) {
        int div = var1 / var2;
        return div;
    }

    //Restul impartirii
    public static int mod(int num1, int num2) {
        int mod = (num1 %= num2);
        return mod;
    }

    //Adunare
    public static int plus(int var1, int var2) {
        int plus = (var1 + var2);
        return plus;
    }

    //Scarede
    public static int sub(int var1, int var2) {
        int sub = (var1 - var2);
        return sub;
    }

    //Media
    public static int media(int var1, int var2, int var3) {
        int media = ((var1 + var2 + var3) / 3);
        return media;
    }

    //Conversie celsius
    public static double celsius(int far) {
        double celsius = ((5 / 9) * (far - 32));
        return celsius;
    }

    //converise inch
    public static double inch(int inc) {
        double inch = (inc * 2.54);
        return inch;
    }

    //viteza
    public static int speedinmps(int meters, int hours, int minutes, int seconds) {
        int speedinmps = (meters / (hours * 60 + minutes * 60 + seconds * 60));
        return speedinmps;
    }

    public static int speedinkph(int meters, int hours) {
        int speedinkph = ((meters / 1000) / hours);
        return speedinkph;
    }

    public static int speedinmph(int meters, int hours) {
        int speedinmph = ((meters / 1609) / hours);
        return speedinmph;

    }

}
