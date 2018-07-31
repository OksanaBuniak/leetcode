public class PalindromePermutation266 {

    public static boolean canPermutePalindrome(String s) {
        int[] characters = new int[127];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            characters[s.charAt(i)]++;
            if (characters[s.charAt(i)] % 2 != 0) {
                count++;
            } else {
                count--;
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("aab"));
        System.out.println(canPermutePalindrome("aabbccacac"));
        System.out.println(canPermutePalindrome("acbac"));
    }
}
