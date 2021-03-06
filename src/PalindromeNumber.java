public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int y = 0;
        int originalx = x;
        while (x != 0) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return originalx == y;
    }

    public static void main(String[] args) {
        //isPalindrome(123321);
        isPalindrome(-2147447412);
    }
}
