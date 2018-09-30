import java.util.ArrayList;

public class MultiplyStringsDimaMethod43 {

    public static String multiply(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty() || num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        ArrayList<Integer> result = new ArrayList<>();
        int len1 = num1.length();
        int len2 = num2.length();

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                int multiplication = (num1.charAt(len1 - i - 1) - '0') * (num2.charAt(len2 - j - 1) - '0');
                if (result.size() <= i + j) {
                    result.add(0);
                }
                result.set(i + j, result.get(i + j) + multiplication);
            }
        }
        return toNormalized(result);
    }

    public static String toNormalized(ArrayList<Integer> input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.size() - 1; i++) {
            sb.append(input.get(i) % 10);
            input.set(i + 1, input.get(i + 1) + input.get(i) / 10);
        }

        sb.append(input.get(input.size() - 1) % 10);
        if (input.get(input.size() - 1) > 9) {
            sb.append(input.get(input.size() - 1) / 10);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String input1 = "9";
        String input2 = "9";
        System.out.println(multiply(input1, input2));
    }
}
