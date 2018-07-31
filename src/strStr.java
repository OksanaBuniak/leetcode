public class strStr {

    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (haystack.length() == 0 || needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length() ; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("helloa", "abs"));
        System.out.println(strStr("helollo", "ll"));
        System.out.println(strStr("a", "a"));
        System.out.println(strStr("a", ""));
        System.out.println(strStr("aaa", "a"));
        System.out.println(strStr("mississippi", "issip"));
    }

}
