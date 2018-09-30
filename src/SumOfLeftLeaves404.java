import java.util.ArrayList;

public class SumOfLeftLeaves404 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /*

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;

        ArrayList<TreeNode> current = new ArrayList<>();
        ArrayList<TreeNode> next = new ArrayList<>();
        current.add(root);

        while (!current.isEmpty()) {
            for (int i = 0; i < current.size(); i++) {
                if (current.get(i).left != null) {
                    if (current.get(i).left.left == null && current.get(i).left.right == null) {
                        sum = sum + current.get(i).left.val;
                    }
                    next.add(current.get(i).left);
                }
                if (current.get(i).right != null) {
                    next.add(current.get(i).right);
                }
            }
            current = next;
            next = new ArrayList<>();
        }

        return sum;
    } */

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumCalculator(root, false);
    }

    public static int sumCalculator(TreeNode current, boolean isLeft) {
        if (current == null) {
            return 0;
        }
        if (isLeft && current.left == null && current.right == null) {
            return current.val;
        }
        return sumCalculator(current.left, true) + sumCalculator(current.right, false);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);

        addRight(a, c);
        addLeft(a, b);
        addRight(c, e);
        addLeft(c, d);

        System.out.println(sumOfLeftLeaves(a));
    }

    public static void addRight(TreeNode parent, TreeNode child) {
        parent.right = child;
    }

    public static void addLeft(TreeNode parent, TreeNode child) {
        parent.left = child;
    }
}
