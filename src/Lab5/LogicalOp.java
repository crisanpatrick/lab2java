package Lab5;

public class LogicalOp {
    public void poparr(int[] array, int maxValue) {
        for (int i = 0; i < maxValue; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

    public void evenarr(int[] array, int maxValue) {
        for (int i = 0; i < maxValue; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

    public double arrayAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        return sum / array.length;
    }

    public boolean isInArray(int[] array, int ceva) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ceva) {
                return true;

            }
        }
        return false;
    }
}

