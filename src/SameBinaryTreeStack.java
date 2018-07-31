import java.util.*;

public class SameBinaryTreeStack {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void addRight(TreeNode parent, TreeNode child) {
        parent.right = child;
    }

    public static void addLeft(TreeNode parent, TreeNode child) {
        parent.left = child;
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> current1 = new Stack<>();
        Stack<TreeNode> current2 = new Stack<>();

        current1.push(p);
        current2.push(q);

        while (!current1.isEmpty()) {
            for (int i = 0; i < current1.size(); i++) {
                TreeNode element1 = current1.pop();
                TreeNode element2 = current2.pop();
                if (element1 == null && element2 == null) {
                    continue;
                }
                if (element1 == null || element2 == null) {
                    return false;
                }
                if (element1.val != element2.val) {
                    return false;
                }
                current1.push(element1.right);
                current1.push(element1.left);
                current2.push(element2.right);
                current2.push(element2.left);
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
