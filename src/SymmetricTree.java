import java.util.ArrayList;

public class SymmetricTree {

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

        ArrayList<TreeNode> current = new ArrayList<>();
        ArrayList<TreeNode> nextLevel = new ArrayList<>();
        current.add(root);

        while (current.size() > 0) {
            int size = current.size();
            for (int i = 0; i < size / 2; i++) {
                if (current.get(i) == null && current.get(size - i - 1) == null) {
                    continue;
                }
                if (current.get(i) == null || current.get(size - i - 1) == null) {
                    return false;
                }
                if (current.get(i).val != current.get(size - i - 1).val) {
                    return false;
                }
                nextLevel.add(current.get(i).left);
                nextLevel.add(current.get(i).right);
            }
            for (int i = size / 2; i < size; i++) {
                if (current.get(i) == null || current.get(i) == null) {
                    continue;
                }
                nextLevel.add(current.get(i).left);
                nextLevel.add(current.get(i).right);
            }
            current = nextLevel;
            nextLevel = new ArrayList<>();
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
