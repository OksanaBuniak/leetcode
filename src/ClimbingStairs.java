
public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int secondLast = 1;
        int last = 2;
        int result = 0;

        for (int i = 3; i <= n; ++i) {
            result = last + secondLast;
            secondLast = last;
            last = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(44));
    }

}
