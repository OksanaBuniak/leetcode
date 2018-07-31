import org.junit.Test;

import static org.junit.Assert.*;

public class SameBinaryTreeStackTest {

    @Test
    public void test1() {
        assertEquals(true, SameBinaryTreeStack.isSameTree(null, null));
    }

    @Test
    public void test2() {
        SameBinaryTreeStack.TreeNode a = new SameBinaryTreeStack.TreeNode(1);
        SameBinaryTreeStack.TreeNode b = new SameBinaryTreeStack.TreeNode(2);
        SameBinaryTreeStack.TreeNode c = new SameBinaryTreeStack.TreeNode(3);
        SameBinaryTreeStack.TreeNode d = new SameBinaryTreeStack.TreeNode(4);
        SameBinaryTreeStack.TreeNode e = new SameBinaryTreeStack.TreeNode(5);
        SameBinaryTreeStack.TreeNode f = new SameBinaryTreeStack.TreeNode(6);

        SameBinaryTreeStack.addRight(a, b);
        SameBinaryTreeStack.addLeft(a, c);
        SameBinaryTreeStack.addRight(b, d);
        SameBinaryTreeStack.addLeft(b, e);
        SameBinaryTreeStack.addLeft(c, f);

        SameBinaryTreeStack.TreeNode a2 = new SameBinaryTreeStack.TreeNode(1);
        SameBinaryTreeStack.TreeNode b2 = new SameBinaryTreeStack.TreeNode(2);
        SameBinaryTreeStack.TreeNode c2 = new SameBinaryTreeStack.TreeNode(3);
        SameBinaryTreeStack.TreeNode d2 = new SameBinaryTreeStack.TreeNode(4);
        SameBinaryTreeStack.TreeNode e2 = new SameBinaryTreeStack.TreeNode(5);
        SameBinaryTreeStack.TreeNode f2 = new SameBinaryTreeStack.TreeNode(6);

        SameBinaryTreeStack.addRight(a2, b2);
        SameBinaryTreeStack.addLeft(a2, c2);
        SameBinaryTreeStack.addRight(b2, d2);
        SameBinaryTreeStack.addLeft(b2, e2);
        SameBinaryTreeStack.addLeft(c2, f2);
        assertEquals(true, SameBinaryTreeStack.isSameTree(a, a2));
    }

    @Test
    public void test3() {
        SameBinaryTreeStack.TreeNode a = new SameBinaryTreeStack.TreeNode(1);
        SameBinaryTreeStack.TreeNode b = new SameBinaryTreeStack.TreeNode(2);
        SameBinaryTreeStack.TreeNode c = new SameBinaryTreeStack.TreeNode(3);
        SameBinaryTreeStack.TreeNode d = new SameBinaryTreeStack.TreeNode(4);
        SameBinaryTreeStack.TreeNode e = new SameBinaryTreeStack.TreeNode(5);
        SameBinaryTreeStack.TreeNode f = new SameBinaryTreeStack.TreeNode(6);

        SameBinaryTreeStack.addRight(a, b);
        SameBinaryTreeStack.addLeft(a, c);
        SameBinaryTreeStack.addRight(b, d);
        SameBinaryTreeStack.addLeft(b, e);
        SameBinaryTreeStack.addLeft(c, f);

        SameBinaryTreeStack.TreeNode a2 = new SameBinaryTreeStack.TreeNode(2);
        SameBinaryTreeStack.TreeNode b2 = new SameBinaryTreeStack.TreeNode(2);
        SameBinaryTreeStack.TreeNode c2 = new SameBinaryTreeStack.TreeNode(3);
        SameBinaryTreeStack.TreeNode d2 = new SameBinaryTreeStack.TreeNode(4);
        SameBinaryTreeStack.TreeNode e2 = new SameBinaryTreeStack.TreeNode(5);
        SameBinaryTreeStack.TreeNode f2 = new SameBinaryTreeStack.TreeNode(5);

        SameBinaryTreeStack.addRight(a2, b2);
        SameBinaryTreeStack.addLeft(a2, c2);
        SameBinaryTreeStack.addRight(b2, d2);
        SameBinaryTreeStack.addLeft(b2, e2);
        SameBinaryTreeStack.addLeft(c2, f2);
        assertEquals(false, SameBinaryTreeStack.isSameTree(a, a2));
    }

    @Test
    public void test4() {
        SameBinaryTreeStack.TreeNode a = new SameBinaryTreeStack.TreeNode(1);
        SameBinaryTreeStack.TreeNode b = new SameBinaryTreeStack.TreeNode(2);
        SameBinaryTreeStack.TreeNode c = new SameBinaryTreeStack.TreeNode(3);
        SameBinaryTreeStack.TreeNode d = new SameBinaryTreeStack.TreeNode(4);
        SameBinaryTreeStack.TreeNode e = new SameBinaryTreeStack.TreeNode(5);
        SameBinaryTreeStack.TreeNode f = new SameBinaryTreeStack.TreeNode(6);

        SameBinaryTreeStack.addRight(a, b);
        SameBinaryTreeStack.addLeft(a, c);
        SameBinaryTreeStack.addRight(b, d);
        SameBinaryTreeStack.addLeft(b, e);
        SameBinaryTreeStack.addLeft(c, f);

        SameBinaryTreeStack.TreeNode a2 = new SameBinaryTreeStack.TreeNode(1);
        SameBinaryTreeStack.TreeNode b2 = new SameBinaryTreeStack.TreeNode(2);
        SameBinaryTreeStack.TreeNode c2 = new SameBinaryTreeStack.TreeNode(3);
        SameBinaryTreeStack.TreeNode d2 = new SameBinaryTreeStack.TreeNode(4);
        SameBinaryTreeStack.TreeNode e2 = new SameBinaryTreeStack.TreeNode(5);
        SameBinaryTreeStack.TreeNode f2 = new SameBinaryTreeStack.TreeNode(6);

        SameBinaryTreeStack.addRight(a2, b2);
        SameBinaryTreeStack.addLeft(a2, c2);
        SameBinaryTreeStack.addRight(b2, d2);
        //SameBinaryTreeStack.addLeft(b2, e2);
        //SameBinaryTreeStack.addLeft(c2, f2);
        assertEquals(false, SameBinaryTreeStack.isSameTree(a, a2));
    }

    @Test
    public void test5() {
        SameBinaryTreeStack.TreeNode a = new SameBinaryTreeStack.TreeNode(1);
        SameBinaryTreeStack.TreeNode b = new SameBinaryTreeStack.TreeNode(2);
        SameBinaryTreeStack.TreeNode c = new SameBinaryTreeStack.TreeNode(3);
        SameBinaryTreeStack.TreeNode d = new SameBinaryTreeStack.TreeNode(4);
        SameBinaryTreeStack.TreeNode e = new SameBinaryTreeStack.TreeNode(5);
        SameBinaryTreeStack.TreeNode f = new SameBinaryTreeStack.TreeNode(6);

        SameBinaryTreeStack.addRight(a, b);
        SameBinaryTreeStack.addLeft(a, c);
        SameBinaryTreeStack.addRight(b, d);
        SameBinaryTreeStack.addLeft(b, e);
        SameBinaryTreeStack.addLeft(c, f);

        assertEquals(false, SameBinaryTreeStack.isSameTree(a, null));
    }

}