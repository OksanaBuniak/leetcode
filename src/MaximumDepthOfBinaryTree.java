import java.util.Stack;

public class MaximumDepthOfBinaryTree {

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
        if (root.right == null && root.left == null) {
            return 1;
        }

        int maxdepth = 0;
        Stack<TreeNode> current = new Stack<>();
        current.push(root);
        Stack<TreeNode> next = new Stack<>();

        while (!current.isEmpty()) {
            while (!current.isEmpty()) {
                TreeNode cur = current.pop();
                if (cur.left != null) {
                    next.push(cur.left);
                }
                if (cur.right != null) {
                    next.push(cur.right);
                }
            }
            maxdepth++;
            current = next;
            next = new Stack<>();
        }

        return maxdepth;
    }

    public static void main(String[] args) {

    }
}
