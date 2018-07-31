public class ValidPalindromeII680 {

    public static boolean validPalindrome(String s) {
        return isValidPalindrome(s, false, 0, s.length() - 1);
    }

    public static boolean isValidPalindrome(String s, boolean deleted, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                if (deleted) {
                    return false;
                } else {
                    return isValidPalindrome(s, true, i + 1, j) || isValidPalindrome(s, true, i, j - 1);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("eeccccbebaeeabebccceea"));
        System.out.println(validPalindrome("abba"));
        System.out.println(validPalindrome("abcbca"));
        System.out.println(validPalindrome("abbaa"));
        System.out.println(validPalindrome("abcdba"));
        System.out.println(validPalindrome("abcdeba"));
        System.out.println(validPalindrome("taba"));
        System.out.println(validPalindrome("abat"));
        System.out.println(validPalindrome("abta"));
    }
}
