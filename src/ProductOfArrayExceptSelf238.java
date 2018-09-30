public class ProductOfArrayExceptSelf238 {

    public static int[] productExceptSelf(int[] nums) {
        int buffer = 1;
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            output[i] = buffer;
            buffer *= nums[i];
        }

        buffer = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = buffer * output[i];
            buffer *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        int[] output = productExceptSelf(input);
        for (int element : output) {
            System.out.print(element + " ");
        }
    }
}
