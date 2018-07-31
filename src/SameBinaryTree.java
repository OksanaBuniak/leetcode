import apple.laf.JRSUIUtils;

public class SameBinaryTree {

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
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        if (!isSameTree(p.right, q.right)) {
            return false;
        }

        if (!isSameTree(p.left, q.left)) {
            return false;
        }

        return true;

        //return (p.val == q.val) && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);

        addRight(a, b);
        addLeft(a, c);
        addRight(b, d);
        addLeft(b, e);
        addLeft(c, f);

        //TreeNode second = a;
        TreeNode a2 = new TreeNode(1);
        TreeNode b2 = new TreeNode(2);
        TreeNode c2 = new TreeNode(3);
        TreeNode d2 = new TreeNode(4);
        TreeNode e2 = new TreeNode(5);
        TreeNode f2 = new TreeNode(6);

        addRight(a2, b2);
        addLeft(a2, c2);
        addRight(b2, d2);
        addLeft(b2, e2);
        addLeft(c2, f2);
        System.out.println(isSameTree(a, a2));
    }
}
