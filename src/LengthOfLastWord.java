public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("a "));
    }

}
