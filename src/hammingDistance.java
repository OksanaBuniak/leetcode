public class hammingDistance {

    public static int hammingDist(int x, int y) {
        int count = 0;
        while (x > 0 || y > 0) {
            if (x % 2 != y % 2) {
                count++;
            }
            x = x / 2;
            y = y / 2;
        }
        return count;
    }

    public static void main(String[] args) {

    }

}
