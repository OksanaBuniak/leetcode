public class GoatLatin824 {

    private static String VOWELS = "aeiou";

    public static String toGoatLatin(String S) {
        StringBuilder newString = new StringBuilder();
        StringBuilder a = new StringBuilder().append('a');

        for (int i = 0; i < S.length(); i++) {
            if (i > 0) {
                newString.append(' ');
            }
            char ch = S.charAt(i);
            char special = ' ';
            if (!isVowel(ch)) {
                special = S.charAt(i);
                i++;
            }
            while (i < S.length() && S.charAt(i) != ' ') {
                newString.append(S.charAt(i));
                i++;
            }
            if (special != ' ') {
                newString.append(special);
            }

            newString.append("ma");
            newString.append(a);
            a.append('a');
        }

        return newString.toString();
    }

    public static boolean isVowel(char ch) {
        return VOWELS.indexOf(Character.toLowerCase(ch)) >= 0;
    }

    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }
}