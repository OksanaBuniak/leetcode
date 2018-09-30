public class MissingNumber268 {

    public static int missingNumber(int[] nums) {
        /*int buff = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == nums.length && i == nums.length - 1) {
                break;
            }
            if (nums[i] == nums.length) {
                i++;
            }
            if (nums[i] != i) {
                buff = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = buff;
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length; */

        int i = 0;

        while (i < nums.length) {
            if (nums[i] == nums.length) {
                i++;
                continue;
            }
            if (nums[i] != i) {
                int buff = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = buff;
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] input = {9, 6, 8, 7, 4, 3, 1, 0, 5};
        int[] input1 = {3, 0, 1};
        int[] input2 = {0};
        int[] input3 = {1};
        int[] input4 = {0, 1};
        System.out.println(missingNumber(input));
        System.out.println(missingNumber(input1));
        System.out.println(missingNumber(input2));
        System.out.println(missingNumber(input3));
        System.out.println(missingNumber(input4));
    }
}
