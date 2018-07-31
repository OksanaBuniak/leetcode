public class SingleNumberXOR {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 1, 2, 3, 1, 1, 2, 2, 4, 4};
        System.out.println(singleNumber(input));
    }
}
