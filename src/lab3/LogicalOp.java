package lab3;

public class LogicalOp {
    public int getHigherNumber(int first, int second,int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
        }
        return "ceva";
}

