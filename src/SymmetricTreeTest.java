import org.junit.Test;

import static org.junit.Assert.*;

public class SymmetricTreeTest {

    public static void addRight(SymmetricTree.TreeNode parent, SymmetricTree.TreeNode child) {
        parent.right = child;
    }

    public static void addLeft(SymmetricTree.TreeNode parent, SymmetricTree.TreeNode child) {
        parent.left = child;
    }

    @Test
    public void test1() {
        assertEquals(true, SymmetricTree.isSymmetric(null));
    }

    @Test
    public void test2() {
        SymmetricTree.TreeNode a = new SymmetricTree.TreeNode(1);
        SymmetricTree.TreeNode b = new SymmetricTree.TreeNode(2);
        SymmetricTree.TreeNode c = new SymmetricTree.TreeNode(3);
        SymmetricTree.TreeNode d = new SymmetricTree.TreeNode(4);
        SymmetricTree.TreeNode e = new SymmetricTree.TreeNode(2);
        SymmetricTree.TreeNode f = new SymmetricTree.TreeNode(4);
        SymmetricTree.TreeNode g = new SymmetricTree.TreeNode(3);

        addRight(a, b);
        addLeft(a, e);
        addRight(b, d);
        addLeft(b, c);
        addLeft(e, f);
        addRight(e, g);

        assertEquals(true, SymmetricTree.isSymmetric(a));
    }

    @Test
    public void test3() {

        SymmetricTree.TreeNode a2 = new SymmetricTree.TreeNode(1);
        SymmetricTree.TreeNode b2 = new SymmetricTree.TreeNode(2);
        SymmetricTree.TreeNode c2 = new SymmetricTree.TreeNode(3);
        SymmetricTree.TreeNode d2 = new SymmetricTree.TreeNode(4);
        SymmetricTree.TreeNode e2 = new SymmetricTree.TreeNode(5);
        SymmetricTree.TreeNode f2 = new SymmetricTree.TreeNode(6);

        addRight(a2, b2);
        addLeft(a2, c2);
        addRight(b2, d2);
        addLeft(b2, e2);
        addLeft(c2, f2);
        assertEquals(false, SymmetricTree.isSymmetric(a2));
    }

    @Test
    public void test4() {

        SymmetricTree.TreeNode a = new SymmetricTree.TreeNode(1);
        SymmetricTree.TreeNode b = new SymmetricTree.TreeNode(2);
        SymmetricTree.TreeNode c = new SymmetricTree.TreeNode(2);
        SymmetricTree.TreeNode d = new SymmetricTree.TreeNode(3);
        SymmetricTree.TreeNode e = new SymmetricTree.TreeNode(3);

        addRight(a, b);
        addLeft(a, c);
        addRight(b, d);
        addRight(c, e);

        assertEquals(false, SymmetricTree.isSymmetric(a));
    }

    @Test
    public void test5() {

        SymmetricTree.TreeNode a = new SymmetricTree.TreeNode(1);
        assertEquals(true, SymmetricTree.isSymmetric(a));
    }
}