public class SymmetricTreeRecursion {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.right == null && root.left == null) {
            return true;
        }
        if (root.right == null || root.left == null) {
            return false;
        }
        return isEqual(root.left, root.right);
    }

    public static boolean isEqual(TreeNode rside, TreeNode lside) {
        if (rside == null && lside == null) {
            return true;
        }
        if (rside == null || lside == null) {
            return false;
        }
        if (rside.val != lside.val) {
            return false;
        }
        return (isEqual(rside.left, lside.right) && isEqual(rside.right, lside.left));
    }

    public static void main(String[] args) {

    }
}
