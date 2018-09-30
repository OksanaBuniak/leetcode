public class ValidateBinarySearchTree98 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    public static boolean isValid(TreeNode current, TreeNode left, TreeNode right) {
        if (current == null) {
            return true;
        }
        if (left != null && current.val <= left.val) {
            return false;
        }
        if (right != null && current.val >= right.val) {
            return false;
        }
        return (isValid(current.left, left, current) && isValid(current.right, current, right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode one = new TreeNode(4);
        TreeNode two = new TreeNode(10);
        TreeNode three = new TreeNode(2);
        TreeNode four = new TreeNode(12);
        TreeNode five = new TreeNode(9);
        root.left = one;
        root.right = two;
        one.left = three;
        two.right = four;
        two.left = five;
        System.out.println(isValidBST(root));

        TreeNode root1 = new TreeNode(1);
        TreeNode one1 = new TreeNode(1);
        root1.left = one1;
        System.out.println(isValidBST(root1));
    }
}
