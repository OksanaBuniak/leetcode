import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                int c = nums[i];
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    if (nums[right] + nums[left] == -c) {
                        result.add(Arrays.asList(c, nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left - 1] == nums[left]) {
                            left++;
                        }
                        while (left < right && nums[right + 1] == nums[right]) {
                            right--;
                        }
                    } else if (nums[right] + nums[left] < -c) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //int[] input = {-1, 0, 1, 2, -1, -4};
        int[] input = {0, 0, 0};
        List<List<Integer>> outcome = threeSum(input);

        for (List<Integer> list: outcome) {
            for (int element : list) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
