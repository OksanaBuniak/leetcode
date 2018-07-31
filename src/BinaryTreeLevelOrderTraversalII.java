import java.util.*;

public class BinaryTreeLevelOrderTraversalII {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {

        Queue<TreeNode> level = new LinkedList<>();
        level.add(root);

        List<List<Integer>> all = new LinkedList<>();
        if (root == null) {
            return all;
        }

        while (level.size() > 0) {
            int size = level.size();
            List<Integer> current = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                if (level.peek().left != null) {
                    level.add(level.peek().left);
                }
                if (level.peek().right != null) {
                    level.add(level.peek().right);
                }
                current.add(level.poll().val);
            }
            all.add(0, current);
        }

        return all;
    }



    public static void addRight(TreeNode parent, TreeNode child) {
        parent.right = child;
    }

    public static void addLeft(TreeNode parent, TreeNode child) {
        parent.left = child;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);

        addRight(a, b);
        addLeft(a, c);
        addRight(b, d);
        addRight(c, e);

        levelOrderBottom(a);
    }
}
