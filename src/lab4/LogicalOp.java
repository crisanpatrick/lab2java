package lab4;

public class LogicalOp {
    public void countUp(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void countDown(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void countFromTo(int var1, int var2) {
        for (int i = var1; i <= var2; i++) {
            System.out.println(i);
        }
    }

    public void asterisk(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if ((i + j) > number) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    //    public void countFromSmallToBig(int var1, int var2){

    //    }
    public void countEven() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void countOdd() {
        for (int i = 1; i <= 100; i++) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }
    }

    public int sumTo100(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public float sumAndAverage(int number) {
        float sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
            count++;
        }
        return sum / count;
    }
}
