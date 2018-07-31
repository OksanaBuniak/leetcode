
public class ReverseInt {

    public static int reverse(int x) {
        long result = 0;
        while(x != 0) {
            if ((result * 10 + x % 10 > Integer.MAX_VALUE) || (result * 10 + x % 10 < Integer.MIN_VALUE)) {
                return 0;
            }
            result = result * 10 + x % 10;
            x = x / 10;
        }
        System.out.println(result);
        return Math.toIntExact(result);
    }

    public static void main(String[] args) {
        //reverse(1534236469); // 9 646 324 351  //2 147 483 647
        reverse(-2147483648);
    }

}
