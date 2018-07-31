import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeTest {

    public static void addRight(MaximumDepthOfBinaryTree.TreeNode parent, MaximumDepthOfBinaryTree.TreeNode child) {
        parent.right = child;
    }

    public static void addLeft(MaximumDepthOfBinaryTree.TreeNode parent, MaximumDepthOfBinaryTree.TreeNode child) {
        parent.left = child;
    }

    @Test
    public void test1() {
        assertEquals(0, MaximumDepthOfBinaryTree.maxDepth(null));
    }

    @Test
    public void test2() {
        MaximumDepthOfBinaryTree.TreeNode a = new MaximumDepthOfBinaryTree.TreeNode(1);
        MaximumDepthOfBinaryTree.TreeNode b = new MaximumDepthOfBinaryTree.TreeNode(2);
        MaximumDepthOfBinaryTree.TreeNode c = new MaximumDepthOfBinaryTree.TreeNode(3);
        MaximumDepthOfBinaryTree.TreeNode d = new MaximumDepthOfBinaryTree.TreeNode(4);
        MaximumDepthOfBinaryTree.TreeNode e = new MaximumDepthOfBinaryTree.TreeNode(2);
        MaximumDepthOfBinaryTree.TreeNode f = new MaximumDepthOfBinaryTree.TreeNode(4);
        MaximumDepthOfBinaryTree.TreeNode g = new MaximumDepthOfBinaryTree.TreeNode(3);

        addRight(a, b);
        addLeft(a, e);
        addRight(b, d);
        addLeft(b, c);
        addLeft(e, f);
        addRight(e, g);

        assertEquals(3, MaximumDepthOfBinaryTree.maxDepth(a));
    }

    @Test
    public void test3() {

        MaximumDepthOfBinaryTree.TreeNode a2 = new MaximumDepthOfBinaryTree.TreeNode(1);
        MaximumDepthOfBinaryTree.TreeNode b2 = new MaximumDepthOfBinaryTree.TreeNode(2);
        MaximumDepthOfBinaryTree.TreeNode c2 = new MaximumDepthOfBinaryTree.TreeNode(3);
        MaximumDepthOfBinaryTree.TreeNode d2 = new MaximumDepthOfBinaryTree.TreeNode(4);
        MaximumDepthOfBinaryTree.TreeNode e2 = new MaximumDepthOfBinaryTree.TreeNode(5);
        MaximumDepthOfBinaryTree.TreeNode f2 = new MaximumDepthOfBinaryTree.TreeNode(6);

        addRight(a2, b2);
        addLeft(a2, c2);
        addRight(b2, d2);
        addLeft(b2, e2);
        addLeft(c2, f2);
        assertEquals(3, MaximumDepthOfBinaryTree.maxDepth(a2));
    }

    @Test
    public void test4() {

        MaximumDepthOfBinaryTree.TreeNode a = new MaximumDepthOfBinaryTree.TreeNode(1);
        MaximumDepthOfBinaryTree.TreeNode b = new MaximumDepthOfBinaryTree.TreeNode(2);
        MaximumDepthOfBinaryTree.TreeNode c = new MaximumDepthOfBinaryTree.TreeNode(2);
        MaximumDepthOfBinaryTree.TreeNode d = new MaximumDepthOfBinaryTree.TreeNode(3);
        MaximumDepthOfBinaryTree.TreeNode e = new MaximumDepthOfBinaryTree.TreeNode(3);

        addRight(a, b);
        addLeft(a, c);
        addRight(b, d);
        addRight(c, e);

        assertEquals(3, MaximumDepthOfBinaryTree.maxDepth(a));
    }

    @Test
    public void test5() {

        MaximumDepthOfBinaryTree.TreeNode a = new MaximumDepthOfBinaryTree.TreeNode(1);
        assertEquals(1, MaximumDepthOfBinaryTree.maxDepth(a));
    }

}