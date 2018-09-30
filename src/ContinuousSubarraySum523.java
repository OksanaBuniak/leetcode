import java.util.HashMap;

public class ContinuousSubarraySum523 {

    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> modSums = new HashMap<>();
        modSums.put(0, -1);
        int subSum = 0;


        for (int i = 0; i < nums.length; i++) {
            subSum += nums[i];
            if (k != 0) {
                subSum %= k;
            }
            if (modSums.containsKey(subSum) && (i - modSums.get(subSum) > 1)) {
                return true;
            }
            modSums.putIfAbsent(subSum, i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] input1 = {23, 2, 4, 6, 7};
        System.out.println(checkSubarraySum(input1, 6));
        int[] input2 = {23, 2, 6, 4, 7};
        System.out.println(checkSubarraySum(input2, 6));
        int[] input3 = {0, 6};
        System.out.println(checkSubarraySum(input3, 6));
        int[] input4 = {6};
        System.out.println(checkSubarraySum(input4, 6));
        int[] input5 = {23,2,6,4,7};
        System.out.println(checkSubarraySum(input5, 0));
    }
}
