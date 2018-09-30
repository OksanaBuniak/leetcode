public class DecodeWays91 {

    public static int numDecodings(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == '0') {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        int waysCount = 0;
        int step1 = 1;
        int step2 = 1;

        for (int i = 1; i < s.length(); i++) {
            waysCount = 0;
            char curChar = s.charAt(i);
            char prevChar = s.charAt(i - 1);

            if (curChar != '0') {
                waysCount += step2;
            }
            if (prevChar == '1' || (prevChar == '2' && curChar <= '6')) {
                waysCount += step1;
            }
            step1 = step2;
            step2 = waysCount;
        }
        return waysCount;
    }

    public static void main(String[] args) {
        //String input = "226";
        //System.out.println(numDecodings(input));
        String input1 = "12";
        System.out.println(numDecodings(input1));
    }
}
