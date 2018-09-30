import java.util.HashMap;

public class MaxSizeSubarraySumK325 {

    public static int maxSize(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, -1);
        int sumOfElements = 0;
        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            sumOfElements += nums[i];
            if (prefixSum.containsKey(sumOfElements - k)) {
                int potentialNewLongest = i - prefixSum.get(sumOfElements - k);
                longest = Math.max(longest, potentialNewLongest);
            }
            prefixSum.putIfAbsent(sumOfElements, i);
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] input = {1, -1, 5, -2, 3};
        System.out.println(maxSize(input, 3));

        int[] input1 = {1};
        System.out.println(maxSize(input1, 3));

        int[] input2 = {1, 2, -1, -2, 2, 1};
        System.out.println(maxSize(input2, 3));
    }
}
