public class RemoveElementArray {

    public static int removeElement(int[] nums, int val) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] input = {3, 1, 2, 3, 3, 5, 6, 3, 5};
        System.out.print(removeElement(input, 3));
    }
}
