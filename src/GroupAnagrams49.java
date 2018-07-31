import java.util.*;

public class GroupAnagrams49 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        HashMap<String, List> anagrams = new HashMap<>();

        int[] letterCount = new int[26];
        for (String s : strs) {
            Arrays.fill(letterCount, 0);
            for (int i = 0; i < s.length(); i++) {
                int letter = s.charAt(i) - 'a';
                letterCount[letter]++;
            }

            StringBuilder sb = new StringBuilder();
            for (int j : letterCount) {
                sb.append(j + ",");
            }
            String word = sb.toString();

            if (!anagrams.containsKey(word)) {
                anagrams.put(word, new ArrayList<>());
            }
            anagrams.get(word).add(s);
        }

        return new ArrayList(anagrams.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output = new LinkedList<>();
        output = groupAnagrams(input);
        for (List<String> list : output) {
            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
