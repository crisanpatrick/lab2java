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

    // While loop
    public void whilecountTo100(int number) {
        while (number <= 100) {
            System.out.println(number);
            number = number + 1;
        }
    }

    public void whileCountFromTo(int number) {
        while (number >= -100) {
            System.out.println(number);
            number = number - 1;
        }
    }

    public void count(int number1, int number2) {
        do {
            System.out.println(number1);
            number1 = number1 + 1;
        } while (number1 <= number2);
    }

    //    public void countSmallToBig(){}
    public void printEven() {
        int x = 0;
        while (x <= 100) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }
    }

    public void printOdd() {
        int x = 0;
        while (x <= 100) {
            if (!(x % 2 == 0)) {
                System.out.println(x);
            }
            x++;
        }
    }
//    public void sumandmed(){
//        int x = 111;
//        int count = 0;
//        while (){
//            for()
//        }

    public void CozaLozaWoza() {
        int x = 1;
        int count = 0;

            while (x <= 110) {
                if (x % 3 == 0) {
                    System.out.print("Coza=");
                }
                if (x % 5 == 0) {
                    System.out.print("Loza=");
                }
                if (x % 7 == 0) {
                    System.out.print("Woza=");
                }
                if (x % 3 == 0 && x % 5 == 0) {
                    System.out.print("CozaLoza=");
                }
                if (x % 3 == 0 && x % 7 == 0) {
                    System.out.print("CozaWoza=");
                }
                if (x % 5 == 0 && x % 7 == 0) {
                    System.out.print("WozaLoza=");
                }
                if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0) {
                    System.out.print("CozaLozaWoza=");
                }
                System.out.print(x+" ");
                x++;
                count++;


            }

        }
    }



