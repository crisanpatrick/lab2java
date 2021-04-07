package lab3;

public class LogicalOp {
    public int getHigherNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String checkText(String text) {
        if (text.equals("FastTrackIT")) {
            System.out.println("Learning text comparison");
        } else {
            System.out.println("Got to try some more");
        }
        return "";
    }

    public String checkTextnNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            System.out.println(text + " " + number);
        } else if (!text.equals("FastTrackIT") && number >= 4) {
            System.out.println(number + " " + text);
        }
        return "";
    }

    public String snow(int number) {
        if (number > 8 || number == 6) {
            return ("The amount of snow this winter was(cm):" + number);
        } else {
            return ("The forecast snow is(cm):" + number);
        }
    }

    //public int vernum(int number) { }
    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isEligibleToVote(int number) {
        if (number >= 18) {
            return true;
        }
        return false;
    }

    public int bigNum(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
        }
    }
}



