import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDepthOfBinaryTreeRecursionTest {

    public static void addRight(MaxDepthOfBinaryTreeRecursion.TreeNode parent, MaxDepthOfBinaryTreeRecursion.TreeNode child) {
        parent.right = child;
    }

    public static void addLeft(MaxDepthOfBinaryTreeRecursion.TreeNode parent, MaxDepthOfBinaryTreeRecursion.TreeNode child) {
        parent.left = child;
    }

    @Test
    public void test1() {
        assertEquals(0, MaxDepthOfBinaryTreeRecursion.maxDepth(null));
    }

    @Test
    public void test2() {
        MaxDepthOfBinaryTreeRecursion.TreeNode a = new MaxDepthOfBinaryTreeRecursion.TreeNode(1);
        MaxDepthOfBinaryTreeRecursion.TreeNode b = new MaxDepthOfBinaryTreeRecursion.TreeNode(2);
        MaxDepthOfBinaryTreeRecursion.TreeNode c = new MaxDepthOfBinaryTreeRecursion.TreeNode(3);
        MaxDepthOfBinaryTreeRecursion.TreeNode d = new MaxDepthOfBinaryTreeRecursion.TreeNode(4);
        MaxDepthOfBinaryTreeRecursion.TreeNode e = new MaxDepthOfBinaryTreeRecursion.TreeNode(2);
        MaxDepthOfBinaryTreeRecursion.TreeNode f = new MaxDepthOfBinaryTreeRecursion.TreeNode(4);
        MaxDepthOfBinaryTreeRecursion.TreeNode g = new MaxDepthOfBinaryTreeRecursion.TreeNode(3);

        addRight(a, b);
        addLeft(a, e);
        addRight(b, d);
        addLeft(b, c);
        addLeft(e, f);
        addRight(e, g);

        assertEquals(3, MaxDepthOfBinaryTreeRecursion.maxDepth(a));
    }

    @Test
    public void test3() {

        MaxDepthOfBinaryTreeRecursion.TreeNode a2 = new MaxDepthOfBinaryTreeRecursion.TreeNode(1);
        MaxDepthOfBinaryTreeRecursion.TreeNode b2 = new MaxDepthOfBinaryTreeRecursion.TreeNode(2);
        MaxDepthOfBinaryTreeRecursion.TreeNode c2 = new MaxDepthOfBinaryTreeRecursion.TreeNode(3);
        MaxDepthOfBinaryTreeRecursion.TreeNode d2 = new MaxDepthOfBinaryTreeRecursion.TreeNode(4);
        MaxDepthOfBinaryTreeRecursion.TreeNode e2 = new MaxDepthOfBinaryTreeRecursion.TreeNode(5);
        MaxDepthOfBinaryTreeRecursion.TreeNode f2 = new MaxDepthOfBinaryTreeRecursion.TreeNode(6);

        addRight(a2, b2);
        addLeft(a2, c2);
        addRight(b2, d2);
        addLeft(b2, e2);
        addLeft(c2, f2);
        assertEquals(3, MaxDepthOfBinaryTreeRecursion.maxDepth(a2));
    }

    @Test
    public void test4() {

        MaxDepthOfBinaryTreeRecursion.TreeNode a = new MaxDepthOfBinaryTreeRecursion.TreeNode(1);
        MaxDepthOfBinaryTreeRecursion.TreeNode b = new MaxDepthOfBinaryTreeRecursion.TreeNode(2);
        MaxDepthOfBinaryTreeRecursion.TreeNode c = new MaxDepthOfBinaryTreeRecursion.TreeNode(2);
        MaxDepthOfBinaryTreeRecursion.TreeNode d = new MaxDepthOfBinaryTreeRecursion.TreeNode(3);
        MaxDepthOfBinaryTreeRecursion.TreeNode e = new MaxDepthOfBinaryTreeRecursion.TreeNode(3);

        addRight(a, b);
        addLeft(a, c);
        addRight(b, d);
        addRight(c, e);

        assertEquals(3, MaxDepthOfBinaryTreeRecursion.maxDepth(a));
    }

    @Test
    public void test5() {

        MaxDepthOfBinaryTreeRecursion.TreeNode a = new MaxDepthOfBinaryTreeRecursion.TreeNode(1);
        assertEquals(1, MaxDepthOfBinaryTreeRecursion.maxDepth(a));
    }

    @Test
    public void test6() {

        MaxDepthOfBinaryTreeRecursion.TreeNode a = new MaxDepthOfBinaryTreeRecursion.TreeNode(1);
        MaxDepthOfBinaryTreeRecursion.TreeNode b = new MaxDepthOfBinaryTreeRecursion.TreeNode(2);

        addLeft(a, b);

        assertEquals(2, MaxDepthOfBinaryTreeRecursion.maxDepth(a));
    }
    
}