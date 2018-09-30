public class Sqrt {

    public static int mySqrt(int x) {
        /*if (x <= 1) {
            return x;
        }

        int sqrt = 1;
        int low = 1;
        int high = Math.min(x/2, 65535);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x / mid < mid) {
                high = mid - 1;
            } else if (x / mid > mid) {
                low = mid + 1;
                sqrt = mid;
            } else {
                return mid;
            }
        }
        return sqrt; */

        if (x == 0) {
            return 0;
        }
        if (x < 4) {
            return 1;
        }
        int low = 2;
        int high = Math.min(x / 2, 65535);

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mid <= x/mid && ((mid + 1) > x/(mid + 1))) {
                return mid;
            }

            if (mid < x/mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(6));
        System.out.println(mySqrt(9));
        System.out.println(mySqrt(28));
        System.out.println(mySqrt(2147395599));
    }
}
