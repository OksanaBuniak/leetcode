public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        // SOLUTION 1
        /*int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        if (i != 0) {
            for (int j = i; j < nums.length; j++) {
                nums[j] = 0;
            }
        }

        // SOLUTION 2
        //int i = 0;
        /* (i < nums.length && nums[i] != 0) {
            i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0 && i != j) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        } */

        // SOLUTION 3

        int slow = 0;
        int fast = slow + 1;
        while (slow < nums.length && fast < nums.length) {
            if (nums[slow] == 0 && nums[fast] != 0) {
                nums[slow] = nums[fast];
                nums[fast] = 0;
            } else if (nums[slow] != 0) {
                slow++;
                fast++;
            } else if (nums[fast] == 0) {
                fast++;
            }
        }

        for (int n : nums) System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int[] input = {2, 5, 0, 1, 0, 3, 12, 15};
        //int[] input = {1};
        //int[] input = {0, 0, 0};
        moveZeroes(input);
    }
}
