import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInArray215 {

    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> kElements = new PriorityQueue<>(k, (a, b) -> a - b);
        for (int i = 0; i < nums.length; i++) {
            if (kElements.size() < k) {
                kElements.add(nums[i]);
            } else if (nums[i] >= kElements.peek()) {
                kElements.poll();
                kElements.add(nums[i]);
            }
        }
        return kElements.poll();
    }

    public static void main(String[] args) {
        int[] input = {3, 2, 1, 5, 6, 4};
        System.out.println(findKthLargest(input, 2));
    }
}
