package lab3;

public class Calculator {
    //Adunare
    public int plus(int var1, int var2) {
        int plus = (var1 + var2);
        return plus;
    }

    public int plus(int var1, int var2, int var3) {
        int plus = (var1 + var2 + var3);
        return plus;
    }

    public int plus(int var1, int var2, int var3, int var4) {
        int plus = (var1 + var2 + var3 + var4);
        return plus;
    }

    //Scarede
    public int sub(int var1, int var2) {
        int sub = (var1 - var2);
        return sub;
    }

    public int sub(int var1, int var2, int var3) {
        int sub = (var1 - var2 - var3);
        return sub;
    }

    public int sub(int var1, int var2, int var3, int var4) {
        int sub = (var1 - var2 - var3 - var4);
        return sub;
    }

    //Inmultire
    public int mult(int first, int second) {
        int mult = first * second;
        return mult;
    }

    public int mult(int first, int second, int third) {
        int mult = first * second * third;
        return mult;
    }

    public int mult(int first, int second, int third, int fourth) {
        int mult = first * second * third * fourth;
        return mult;
    }

    //Impartire
    public double div(int var1, int var2) {
        int div = var1 / var2;
        return div;
    }

    public double div(int var1, int var2, int var3) {
        int div = var1 / var2 / var3;
        return div;
    }

    public double div(int var1, int var2, int var3, int var4) {
        int div = var1 / var2 / var3 / var4;
        return div;
    }

    //Restul impartirii
    public int mod(int num1, int num2) {
        int mod = (num1 %= num2);
        return mod;
    }

    public int mod(int num1, int num2, int num3) {
        int mod = (num1 %= num2 %= num3);
        return mod;
    }

    public int mod(int num1, int num2, int num3, int num4) {
        int mod = (num1 %= num2 %= num3 %= num4);
        return mod;
    }

    //Media
    public int media(int var1, int var2) {
        int media = ((var1 + var2) / 3);
        return media;
    }

    public int media(int var1, int var2, int var3) {
        int media = ((var1 + var2 + var3) / 3);
        return media;
    }

    public int media(int var1, int var2, int var3, int var4) {
        int media = ((var1 + var2 + var3 + var4) / 4);
        return media;
    }

    //Conversie celsius
    public double celsius(int far) {
        float celsius = ((5f / 9) * (far - 32));
        return celsius;
    }

    //converise inch
    public double inch(int cm) {
        double inch = (cm * 2.54);
        return inch;
    }

    //Viteza in Metri per Secunda
    public int speedinmps(int meters, int hours, int minutes, int seconds) {
        int speedinmps = (meters / (hours * 60 + minutes * 60 + seconds));
        return speedinmps;
    }

    //Viteza in KM per Ora
    public int speedinkph(int meters, int hours) {
        int speedinkph = ((meters / 1000) / hours);
        return speedinkph;
    }

    //Viteza in Mile per Ora
    public int speedinmph(int meters, int hours) {
        int speedinmph = ((meters / 1609) / hours);
        return speedinmph;
    }
}
