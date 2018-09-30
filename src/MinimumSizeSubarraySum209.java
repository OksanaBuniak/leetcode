public class MinimumSizeSubarraySum209 {

    public static int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int min = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        int sum = nums[rightPointer];

        while (rightPointer < nums.length) {
            if (sum >= s) {
                if (rightPointer == leftPointer) {
                    return 1;
                }
                if (min == 0 || min > rightPointer - leftPointer + 1) {
                    min = rightPointer - leftPointer + 1;
                }
                sum = sum - nums[leftPointer];
                leftPointer++;
            } else {
                if (rightPointer != nums.length - 1) {
                    sum = sum + nums[rightPointer + 1];
                }
                rightPointer++;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, input));

        int[] input1 = {1, 1, 2};
        System.out.println(minSubArrayLen(2, input1));

        int[] input2 = {2, 3, 1, 2, 4, 8};
        System.out.println(minSubArrayLen(8, input2));

        int[] input3 = {2, 3, 1, 2, 4, 8};
        System.out.println(minSubArrayLen(100, input3));
    }
}
