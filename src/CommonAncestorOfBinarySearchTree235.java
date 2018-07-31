public class CommonAncestorOfBinarySearchTree235 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode temp = p;
            p = q;
            q = temp;
        }
        TreeNode common = root;
        while (common != null) {
            if (p == common || q == common) {
                return common;
            }
            if (p.val < common.val && q.val > common.val) {
                return common;
            }
            if (q.val < common.val) {
                common = common.left;
            } else {
                common = common.right;
            }
        }
        return common;
    }

    public static void addRight(TreeNode parent, TreeNode child) {
        parent.right = child;
    }

    public static void addLeft(TreeNode parent, TreeNode child) {
        parent.left = child;
    }

    public static void main(String[] args) {
        /*TreeNode a = new TreeNode(6);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(8);
        TreeNode d = new TreeNode(0);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(9);
        TreeNode h = new TreeNode(3);
        TreeNode i = new TreeNode(5);

        addRight(a, c);
        addLeft(a, b);
        addRight(b, e);
        addLeft(b, d);
        addRight(c, g);
        addLeft(c, f);
        addRight(e, i);
        addLeft(e, h);

        System.out.println(lowestCommonAncestor(a, h, i).val); //3, 5 --> 4
        System.out.println(lowestCommonAncestor(a, b, c).val); //2, 8 --> 6
        System.out.println(lowestCommonAncestor(a, b, e).val); //2, 4 --> 2
*/

        TreeNode a1 = new TreeNode(2);
        TreeNode b1 = new TreeNode(1);
        TreeNode c1 = new TreeNode(3);
        addLeft(a1, b1);
        addRight(a1, c1);
        System.out.println(lowestCommonAncestor(a1, c1, b1).val);
    }
}
