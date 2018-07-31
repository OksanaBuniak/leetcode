public class Sqrt {

    public static int mySqrt(int x) {
        if (x <= 1) {
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
        return sqrt;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
