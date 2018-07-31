public class Sort3Colors {

    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            } else if (nums[mid] == 1) {
                mid++;
            }
        }
        for (int num : nums) {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 0, 1, 2, 0};
        int[] input2 = {0, 0, 1, 1, 2, 2, 0, 1, 2, 1, 1, 0, 0};
        sortColors(input);
        System.out.println();
        sortColors(input2);
    }
}
