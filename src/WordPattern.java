import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> patterns = new HashMap<>();
        Set<String> usedWords = new HashSet<>();

        for (int j = 0; j < pattern.length(); j++) {
            String word = words[j];
            char patternC = pattern.charAt(j);
            if (patterns.containsKey(patternC)) {
                if (!patterns.get(patternC).equals(word)) {
                    return false;
                }
            } else {
                if (usedWords.contains(word)) {
                    return false;
                }
                patterns.put(patternC, word);
                usedWords.add(word);
            }
        }
        return true;

        /*Map<Character, String> patterns = new HashMap<>();  // can create array of Strings, Char - 'a' trick
        Set<String> words = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int j = 0;

        for (int i = 0; i < str.length(); i++) {
            if (j == pattern.length()) {
                return false;
            }
            while (i < str.length() && str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
                i++;
            }
            String word = sb.toString();
            char patternC = pattern.charAt(j);
            if (patterns.containsKey(patternC)) {
                if (!patterns.get(patternC).equals(word)) {
                    return false;
                }
            } else {
                if (words.contains(word)) {
                    return false;
                }
                patterns.put(patternC, word);
                words.add(word);
            }
            j++;
            sb.setLength(0);
        }

        return j == pattern.length(); */
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }
}
