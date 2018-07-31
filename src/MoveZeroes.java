public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        /*  SOLUTION 1
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (int j = i; j < nums.length; j++) {
            nums[j] = 0;
        } */

        // SOLUTION 2
        int i = 0;
        /* (i < nums.length && nums[i] != 0) {
            i++;
        } */
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0 && i != j) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        }

        for (int n : nums) System.out.print(n + " ");
    }

    public static void main(String[] args) {
        //int[] input = {2, 5, 0, 1, 0, 3, 12, 15};
        int[] input = {1};
        moveZeroes(input);
    }
}
