public class CountAndSay {

    public static String countAndSay(int n) {
        if (n == 0) {
            return null;
        }
        if (n == 1) {
            return "1";
        }
        String result = "1";

        for (int i = 2; i <=n; i++) {
            result = buildString(result);
        }
        return result;
    }

    public static String buildString(String curr) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < curr.length(); j++) {
            char a = curr.charAt(j);
            int count = 1;
            while (j < curr.length() - 1 && curr.charAt(j + 1) == a) {
                count++;
                j++;
            }
            sb.append(count);
            sb.append(a);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(7));
    } //13112221
}

