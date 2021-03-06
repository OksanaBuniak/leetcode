import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths257 {

    static List<String> result = new LinkedList<>();

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
        if (root != null) {
            stringBuilder(root, "", result);
        }
        return result;
    }

    public void stringBuilder(TreeNode curr, String path, List<String> result) {
        String currPath = path + curr.val;
        if (curr.right == null && curr.left == null) {
            result.add(currPath);
        }
        if (curr.left != null) {
            stringBuilder(curr.left, currPath + "->", result);
        }
        if (curr.right != null) {
            stringBuilder(curr.right, currPath + "->", result);
        }
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
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(7);

        addRight(a, b);
        addLeft(a, e);
        addRight(b, d);
        addLeft(b, c);
        addLeft(e, f);
        addRight(e, g);
        addRight(g, h);

        List<String> result = new BinaryTreePaths257().binaryTreePaths(a);
        result.forEach(System.out::println);

        TreeNode a1 = new TreeNode(1);
        List<String> result1 = new BinaryTreePaths257().binaryTreePaths(a1);
        result1.forEach(System.out::println);

    }
}

/*
1->5->6
1->5->7->7
1->2->3
1->2->4
1->5->6
1->5->7->7
1->2->3
1->2->4
1
 */
