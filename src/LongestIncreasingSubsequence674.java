public class LongestIncreasingSubsequence674 {

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 5, 2, 3, 4, 5, 6};
        System.out.println(findLengthOfLCIS(input));
    }
}
