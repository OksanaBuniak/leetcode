import java.util.LinkedList;
import java.util.List;

public class LetterCombinationPhoneNumber {
    /*
    public static List<String> letterCombinations(String digits) {
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> stringBuilder = new LinkedList<>();
        if (digits.length() == 0) {
            return stringBuilder;
        }
        stringBuilder.add("");

        for (int i = 0; i < digits.length(); i++) {  //23 == 2
            int digit = digits.charAt(i) - '0';
            while (stringBuilder.peek().length() == i) {  // current elements
                String curr = stringBuilder.remove();
                for (int j = 0; j < mapping[digit].length(); j++) {  //2 = abc   3 = def
                    stringBuilder.add(curr + mapping[digit].charAt(j));
                }
            }
        }
        return stringBuilder;
    } */

    private static String[] keys = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<>();
        if (digits.length() == 0) {
            return result;
        }
        generateCombinations(digits, result, new StringBuilder());
        return result;
    }

    public static void generateCombinations(String digits, List<String> result, StringBuilder combination) {
        if (combination.length() == digits.length()) {
            result.add(combination.toString());
            return;
        }

        int digit = digits.charAt(combination.length()) - '0';
        String options = keys[digit];

        for (int i = 0; i < options.length(); i++) {
            combination.append(options.charAt(i));
            generateCombinations(digits, result, combination);
            combination.setLength(combination.length() - 1);
        }
    }

    public static void main(String[] args) {
        List<String> output = letterCombinations("23");
        for (String s : output) {
            System.out.print(s + " ");
        }
    }
}
