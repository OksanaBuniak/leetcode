import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class WordBreak139 {

    // Solution 1 - accepted, DP
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] stats = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                String sub = s.substring(j, i + 1);
                if (wordDict.contains(sub) && (j == 0 || stats[j - 1])) {
                    stats[i] = true;
                    break;
                }
            }
        }

        return stats[s.length() - 1];
    }

    // Solution 2 - exceeds time limit
    public static boolean wordBreakRecursive(String s, List<String> wordDict) {
        int size = s.length();
        if (size == 0) {
            return true;
        }

        for (int i = 1; i <= size; i++) {
            if (isInDictionary(s.substring(0, i), wordDict) && wordBreakRecursive(s.substring(i, size), wordDict)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isInDictionary(String substr, List<String> wordDict) {
        if (wordDict.contains(substr)) {
            return true;
        } else {
            return false;
        }
    }

    // Solution 3 - Accepted with HashSet for bad strings, exceeds time without

    public static boolean wordBreakRecursive1(String s, List<String> wordDict) {
        return checkWord(s, wordDict, new LinkedHashSet<>());
    }

    public static boolean checkWord(String s, List<String> wordDict, HashSet<String> badCombo) {
        if (badCombo.contains(s)) {
            return false;
        }

        for (String word : wordDict) {
            if (s.equals(word)) {
                return true;
            }
            if (s.startsWith(word)) {
                if (checkWord(s.substring(word.length(), s.length()), wordDict, badCombo)) {
                    return true;
                }
            }
        }
        badCombo.add(s);
        return false;
    }


    public static void main(String[] args) {
        /*String s = "leetcode";
        List<String> wordDict = new LinkedList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(wordBreak(s, wordDict));
        System.out.println(wordBreakRecursive(s, wordDict));
        System.out.println(wordBreakRecursive1(s, wordDict));
        System.out.println();

        String s1 = "aaaaaaa";
        List<String> wordDict1 = new LinkedList<>();
        wordDict1.add("aaaa");
        wordDict1.add("aa");
        System.out.println(wordBreak(s1, wordDict1));
        System.out.println(wordBreakRecursive(s1, wordDict1));
        System.out.println(wordBreakRecursive1(s1, wordDict1));
        System.out.println();

        String s2 = "applepenapple";
        List<String> wordDict2 = new LinkedList<>();
        wordDict2.add("apple");
        wordDict2.add("pen");
        System.out.println(wordBreak(s2, wordDict2));
        System.out.println(wordBreakRecursive(s2, wordDict2));
        System.out.println(wordBreakRecursive1(s2, wordDict2));
        System.out.println(); */

        String s3 = "cars";
        List<String> wordDict3 = new LinkedList<>();
        wordDict3.add("car");
        wordDict3.add("ca");
        wordDict3.add("rs");
        //System.out.println(wordBreak(s3, wordDict3));
        //System.out.println(wordBreakRecursive(s3, wordDict3));
        System.out.println(wordBreakRecursive1(s3, wordDict3));
        System.out.println();
    }
}



/*

    public static boolean suffixBreak(String s, List<String> wordDict, HashSet<String> badWords) {


        boolean found = true;
        while (s.length() != 0) {
            if (!found) {
                return false;
            }
            found = false;
            for (int i = 0; i < wordDict.size(); i++) {
                String word = wordDict.get(i);
                if (s.length() < word.length()) {
                    continue;
                }
                String sub = s.substring(0, word.length());
                if (sub.equals(word)) {
                    s = s.substring(word.length(), s.length());
                    found = true;
                    break;
                }
            }
        }

        if (!found)

        return (found && suffixBreak(s, wordDict, badWords));

    }
 */