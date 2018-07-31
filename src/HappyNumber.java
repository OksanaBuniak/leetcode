import java.util.*;

public class HappyNumber {

    public static boolean isHappy(int n) {
        int m = 0;
        Set<Integer> numbers = new HashSet<>();
        while (m != 1) {
            m = 0;
            while (n > 0) {
                m = m + (n % 10) * (n % 10);
                n = n / 10;
            }
            if (numbers.contains(m)) {
                return false;
            }
            numbers.add(m);
            n = m;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }
}
