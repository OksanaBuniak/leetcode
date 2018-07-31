public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        int pos = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[pos]) {
                pos++;
                nums[pos] = nums[i];
            }
        }
        return pos + 1;
    }

    public static void main(String[] args) {
        int[] input = {1, 1, 1, 2, 2, 3, 3, 4, 4};
        System.out.println(removeDuplicates(input));
    }
}
