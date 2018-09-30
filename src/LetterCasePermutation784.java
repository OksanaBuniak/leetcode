import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LetterCasePermutation784 {

    public static List<String> letterCasePermutation(String S) {
        List<String> result = new LinkedList<>();
        generatePermutations(S, result, new LinkedList<>(), 0);
        return result;
    }

    public static void generatePermutations(String s, List<String> result, LinkedList<Character> curList, int index) {
        if (curList.size() == s.length()) {
            result.add(curList.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining("")));
            return;
        }

        if (Character.isLetter(s.charAt(index))) {
            curList.add(Character.toLowerCase(s.charAt(index)));
            generatePermutations(s, result, curList, index + 1);
            curList.removeLast();

            curList.add(Character.toUpperCase(s.charAt(index)));
            generatePermutations(s, result, curList, index + 1);
            curList.removeLast();
        } else {
            curList.add(s.charAt(index));
            generatePermutations(s, result, curList, index + 1);
            curList.removeLast();
        }
    }

    public static void main(String[] args) {
        List<String> output = letterCasePermutation("a1b2");
        output.forEach(System.out::println);
    }
}
