public class PalindromeString {

    public static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));
        String input1 = "race a car";
        System.out.println(isPalindrome(input1));
        String input2 = "";
        System.out.println(isPalindrome(input2));
        String input3 = "r";
        System.out.println(isPalindrome(input3));
        String input4 = ".,";
        System.out.println(isPalindrome(input4));
        String input5 = "0P";
        System.out.println(isPalindrome(input5));
        String input6 = ".a";
        System.out.println(isPalindrome(input6));
    }
}
