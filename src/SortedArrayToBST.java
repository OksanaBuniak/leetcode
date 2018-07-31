public class SortedArrayToBST {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        TreeNode root = addChildren(0, nums.length - 1, nums);
        return root;
    }

    public static TreeNode addChildren(int low, int high, int[] nums) {
        if (low > high) {
            return null;
        }
        int mid = low + (high - low) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.right = addChildren(mid + 1, high, nums);
        node.left = addChildren(low, mid - 1, nums);
        return node;
    }

    public static void main(String[] args) {
        int[] input = {-10, -3, 0, 5, 9};
        sortedArrayToBST(input);
    }
}
