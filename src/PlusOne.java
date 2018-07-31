import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int len = digits.length;

        int carryForward = 1;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] + carryForward < 10) {
                digits[i] = digits[i] + carryForward;
                return digits;
            }
            digits[i] = 0;
        }

        int[] extndDigits = new int[len + 1];
        extndDigits[0] = 1;
        return extndDigits;
    }

    public static void main(String[] args) {
        int[] input = {9, 9, 9};
        //int[] input = {9, 0, 2};
        //int[] input = {9, 0, 7, 9, 9, 9};
        //int[] input = {9};
        int[] output = plusOne(input);
        System.out.println(Arrays.toString(output));
    }
}
