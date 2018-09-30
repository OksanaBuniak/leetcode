import com.sun.istack.internal.Nullable;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal102 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }

        List<List<Integer>> result = new LinkedList<>();
        List<Integer> level = new LinkedList<>();
        LinkedList<TreeNode> curLevel = new LinkedList<>();
        curLevel.add(root);

        while (!curLevel.isEmpty()) {
            int length = curLevel.size();
            int i = 0;
            while (i < length) {
                TreeNode node = curLevel.removeFirst();
                level.add(node.val);
                addIfNotNull(curLevel, node.left);
                addIfNotNull(curLevel, node.right);
                i++;
            }
            result.add(level);
            level = new LinkedList<>();
        }

        return result;
    }

    private static void addIfNotNull(List<TreeNode> list, @Nullable TreeNode node) {
        if (node == null) return;
        list.add(node);
    }

    public static void addRight(TreeNode parent, TreeNode child) {
        parent.right = child;
    }

    public static void addLeft(TreeNode parent, TreeNode child) { parent.left = child; }

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

        List<List<Integer>> output = levelOrder(a);
        for (List<Integer> level : output) {
            for (int x : level) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
