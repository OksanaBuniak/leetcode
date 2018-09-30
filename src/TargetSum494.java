import java.util.HashMap;
import java.util.Map;

public class TargetSum494 {

    public static int findTargetSumWays(int[] nums, int S) {
        HashMap<Integer, Integer> sumToWays = new HashMap<>();
        sumToWays.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            HashMap<Integer, Integer> curSumToWays = new HashMap<>();

            for (Map.Entry<Integer, Integer> entry : sumToWays.entrySet()) {
                int prevTimes = entry.getValue();
                updateSums(curSumToWays, nums[i] + entry.getKey(), prevTimes);
                updateSums(curSumToWays, -nums[i] + entry.getKey(), prevTimes);
            }
            sumToWays = curSumToWays;
        }
        return sumToWays.getOrDefault(S, 0);
    }

    public static void updateSums(HashMap<Integer, Integer> curSumToWays, int sum, int prevTimes) {
        int curTimes = curSumToWays.getOrDefault(sum, 0);
        curSumToWays.put(sum, prevTimes + curTimes);
    }

    public static void main(String[] args) {
        int[] input = {0,0,0,0,0,0,0,0,1};
        System.out.println(findTargetSumWays(input, 1));
    }
}
