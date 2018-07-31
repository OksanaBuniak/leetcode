public class PowXN50 {

    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) return myPow(x * x, n / 2);
        else {
            if (n > 0) return x * myPow(x * x, n / 2);
            else return (1 / x) * myPow(x * x, n / 2);
        }

        /*int npos = Math.abs(n);
        double result = x;

        for (int i = 2; i <= npos; i++) {
            result = result * x;
        }

        if (n < 0) {
            result = 1 / result;
        }

        return result; */
    }

    public static void main(String[] args) {
        //System.out.println(myPow(2.0000, 10));
        //System.out.println(myPow(2.1, 3));
        System.out.println(myPow(2, -10));
        System.out.println(myPow(-2, 2));
        System.out.println(myPow(-2, 3));
        System.out.println(myPow(0.44258, 0));
        System.out.println(myPow(0.00001, 2147483647));
    }
}
