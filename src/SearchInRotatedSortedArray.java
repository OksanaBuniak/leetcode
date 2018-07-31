public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target == nums[low]) {
                return low;
            }
            if (target == nums[high]) {
                return high;
            }
            if (isininterval(nums[low], nums[mid], target)) {
                high = mid - 1;
            } else if (isininterval(nums[mid], nums[high], target)) {
                low = mid + 1;
            } else return -1;
        }
        return -1;
    }

    public static boolean isininterval(int low, int high, int target) {
        return ((target > low && target < high) || (target < high && low > high) || (target > low && low > high));
    }

    public static void main(String[] args) {
        /*int[] input = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(search(input, 2));
        System.out.println(search(input, 5));
        System.out.println(search(input, 0));
        System.out.println(search(input, 8)); */
        int[] input1 = {4,5,6,7,8,1,2,3};
        System.out.println(search(input1, 8));
    }
}
