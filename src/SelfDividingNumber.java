import java.util.*;

public class SelfDividingNumber {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
                System.out.print(i + " , ");
            }
        }
        return result;
    }

    public static boolean isSelfDividing(int number) {
        int origNumber = number;
        while (number > 0) {
            int digit = number % 10;
            if (digit == 0) {
                return false;
            }
            if (origNumber % digit != 0) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        selfDividingNumbers(1, 22);
    }

}
