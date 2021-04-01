package lab2;

public class Main {

    public static void main(String[] args) {
        float i = substract(22.5f, 34.5f, 67.9f);
        System.out.println(i);
    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static float substract(float first, float second, float third) {
        float result = first - second - third;
        return result;
    }
}
