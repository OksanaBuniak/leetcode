import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }
        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (letters.containsKey(s.charAt(i))) {
                letters.put(s.charAt(i), letters.get(s.charAt(i)) + 1);
            } else {
                letters.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (letters.containsKey(t.charAt(i))) {
                if (letters.get(t.charAt(i)) <= 0) {
                    return false;
                }
                letters.put(t.charAt(i), letters.get(t.charAt(i)) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram" , "nagaram"));
        System.out.println(isAnagram("abrakadabra", "apricot"));
    }
}
