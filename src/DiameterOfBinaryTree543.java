public class DiameterOfBinaryTree543 {

    static int max = 0;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        MaxCounter maxCounter = new MaxCounter();
        height(root, maxCounter);
        return maxCounter.max;
    }

    private static class MaxCounter {
        int max = 0;
    }

    public static int height(TreeNode curr, MaxCounter maxCounter) {
        if (curr == null) {
            return 0;
        }

        int left = height(curr.left, maxCounter);
        int right = height(curr.right, maxCounter);

        maxCounter.max = Math.max(maxCounter.max, left + right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);

        addRight(a,b);
        addLeft(a,c);
        addRight(c, d);
        addLeft(c, e);
        addRight(b, f);

        System.out.println(diameterOfBinaryTree(a));
    }

    public static void addRight(TreeNode parent, TreeNode child) {
        parent.right = child;
    }

    public static void addLeft(TreeNode parent, TreeNode child) {
        parent.left = child;
    }
}
