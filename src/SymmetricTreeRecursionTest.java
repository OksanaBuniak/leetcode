import org.junit.Test;

import static org.junit.Assert.*;


public class SymmetricTreeRecursionTest {

    public static void addRight(SymmetricTreeRecursion.TreeNode parent, SymmetricTreeRecursion.TreeNode child) {
        parent.right = child;
    }

    public static void addLeft(SymmetricTreeRecursion.TreeNode parent, SymmetricTreeRecursion.TreeNode child) {
        parent.left = child;
    }

    @Test
    public void test1() {
        assertEquals(true, SymmetricTreeRecursion.isSymmetric(null));
    }

    @Test
    public void test2() {
        SymmetricTreeRecursion.TreeNode a = new SymmetricTreeRecursion.TreeNode(1);
        SymmetricTreeRecursion.TreeNode b = new SymmetricTreeRecursion.TreeNode(2);
        SymmetricTreeRecursion.TreeNode c = new SymmetricTreeRecursion.TreeNode(3);
        SymmetricTreeRecursion.TreeNode d = new SymmetricTreeRecursion.TreeNode(4);
        SymmetricTreeRecursion.TreeNode e = new SymmetricTreeRecursion.TreeNode(2);
        SymmetricTreeRecursion.TreeNode f = new SymmetricTreeRecursion.TreeNode(4);
        SymmetricTreeRecursion.TreeNode g = new SymmetricTreeRecursion.TreeNode(3);

        addRight(a, b);
        addLeft(a, e);
        addRight(b, d);
        addLeft(b, c);
        addLeft(e, f);
        addRight(e, g);

        assertEquals(true, SymmetricTreeRecursion.isSymmetric(a));
    }

    @Test
    public void test3() {

        SymmetricTreeRecursion.TreeNode a2 = new SymmetricTreeRecursion.TreeNode(1);
        SymmetricTreeRecursion.TreeNode b2 = new SymmetricTreeRecursion.TreeNode(2);
        SymmetricTreeRecursion.TreeNode c2 = new SymmetricTreeRecursion.TreeNode(3);
        SymmetricTreeRecursion.TreeNode d2 = new SymmetricTreeRecursion.TreeNode(4);
        SymmetricTreeRecursion.TreeNode e2 = new SymmetricTreeRecursion.TreeNode(5);
        SymmetricTreeRecursion.TreeNode f2 = new SymmetricTreeRecursion.TreeNode(6);

        addRight(a2, b2);
        addLeft(a2, c2);
        addRight(b2, d2);
        addLeft(b2, e2);
        addLeft(c2, f2);
        assertEquals(false, SymmetricTreeRecursion.isSymmetric(a2));
    }

    @Test
    public void test4() {

        SymmetricTreeRecursion.TreeNode a = new SymmetricTreeRecursion.TreeNode(1);
        SymmetricTreeRecursion.TreeNode b = new SymmetricTreeRecursion.TreeNode(2);
        SymmetricTreeRecursion.TreeNode c = new SymmetricTreeRecursion.TreeNode(2);
        SymmetricTreeRecursion.TreeNode d = new SymmetricTreeRecursion.TreeNode(3);
        SymmetricTreeRecursion.TreeNode e = new SymmetricTreeRecursion.TreeNode(3);

        addRight(a, b);
        addLeft(a, c);
        addRight(b, d);
        addRight(c, e);

        assertEquals(false, SymmetricTreeRecursion.isSymmetric(a));
    }

    @Test
    public void test5() {

        SymmetricTreeRecursion.TreeNode a = new SymmetricTreeRecursion.TreeNode(1);
        assertEquals(true, SymmetricTreeRecursion.isSymmetric(a));
    }
}