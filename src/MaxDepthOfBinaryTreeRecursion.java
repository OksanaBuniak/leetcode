public class MaxDepthOfBinaryTreeRecursion {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //return (1 + Math.max(maxDepth(root.right), maxDepth(root.left)));
        int depth = 1;
        return (Math.max(findDepth(root.right, depth), findDepth(root.left, depth)));
    }

    public static int findDepth(TreeNode cur, int depth) {
        if (cur == null) {
            return depth;
        }
        return (Math.max(findDepth(cur.right, depth + 1), findDepth(cur.left, depth + 1)));
    }

    public static void main(String[] args) {

    }
}
