public class AddBinaryStrings {

    public static String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();

        StringBuilder result = new StringBuilder();
        int carryon = 0;
        int acur;
        int bcur;

        for (int i = 0; i < Math.max(n, m); i++) {
            acur = getSafeCharAt(n - i - 1, a);
            bcur = getSafeCharAt(m - i - 1, b);
            result.append((acur + bcur + carryon) % 2);
            carryon = (acur + bcur + carryon) / 2;
        }

        if (carryon == 1) {
            result.append(carryon);
        }

        return result.reverse().toString();
    }

    private static int getSafeCharAt(int index, String str) {
        if (index < 0) {
            return 0;
        }
        return str.charAt(index) - '0';
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1101", "11100"));
    }
}
