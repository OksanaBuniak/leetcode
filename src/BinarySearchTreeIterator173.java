import java.util.Iterator;
import java.util.Stack;

public class BinarySearchTreeIterator173 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    public static class BSTIterator implements Iterator<Integer> {

        private static final Stack<TreeNode> stack = new Stack<>();
        private static TreeNode current;

        public BSTIterator(TreeNode root) {
           current = root;
        }

        @Override
        public boolean hasNext() {
            return (!stack.isEmpty() || current != null);
        }

        @Override
        public Integer next() {
            while (current != null) {
                stack.add(current);
                current = current.left;
            }
            current = stack.pop();
            int val = current.val;
            current = current.right;
            return val;
        }
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

        BSTIterator i = new BSTIterator(root);
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
