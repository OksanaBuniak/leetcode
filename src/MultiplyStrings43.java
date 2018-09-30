import java.util.ArrayList;

public class MultiplyStrings43 {
    public static String multiply(String num1, String num2) {
        ArrayList<Integer> result = new ArrayList<>();
        int len1 = num1.length();
        int len2 = num2.length();
        int buffer = 0;
        int sumBuf = 0;

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                int multiplication = (num1.charAt(len1 - i - 1) - '0') * (num2.charAt(len2 - j - 1) - '0') + buffer + sumBuf;
                sumBuf = add(multiplication, result, i + j);
                buffer = multiplication / 10;
            }
            sumBuf = add(buffer + sumBuf, result, i + len2);
        }

        if (sumBuf != 0) {
            result.add(sumBuf);
        }

        StringBuilder sb = new StringBuilder();
        int i = result.size() - 1;
        while (result.get(i) == 0) {
            i--;
        }
        for (int j = i; j >= 0; j--) {
            sb.append(result.get(j));
        }
        return sb.toString();
    }

    public static int add(int mult, ArrayList<Integer> result, int position) {
        int multAdd = mult % 10;
        int sum = 0;
        if (!result.isEmpty() && result.size() > position) {
            sum = multAdd + result.get(position);
            result.set(position, sum % 10);
        } else {
            sum = multAdd;
            result.add(sum % 10);
        }
        return sum / 10;
    }

    public static void main(String[] args) {
        String input1 = "456";
        String input2 = "123";
        System.out.println(multiply(input1, input2));
    }
}
