import apple.laf.JRSUIUtils;

import java.util.*;

public class SameBinaryTreeLists {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void addRight(TreeNode parent, TreeNode child) {
        parent.right = child;
    }

    public static void addLeft(TreeNode parent, TreeNode child) {
        parent.left = child;
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<TreeNode> current1 = new ArrayList<>();
        ArrayList<TreeNode> current2 = new ArrayList<>();
        ArrayList<TreeNode> nextLevel1 = new ArrayList<>();
        ArrayList<TreeNode> nextLevel2 = new ArrayList<>();

        current1.add(p);
        current2.add(q);

        while (current1.size() > 0) {
            for (int i = 0; i < current1.size(); i++) {
                if (current1.get(i) == null && current2.get(i) == null) {
                    continue;
                }
                if (current1.get(i) == null || current2.get(i) == null) {
                    return false;
                }
                if (current1.get(i).val != current2.get(i).val) {
                    return false;
                }
                nextLevel1.add(current1.get(i).right);
                nextLevel1.add(current1.get(i).left);
                nextLevel2.add(current2.get(i).right);
                nextLevel2.add(current2.get(i).left);
            }
            current1 = nextLevel1;
            current2 = nextLevel2;
            nextLevel1 = new ArrayList<>();
            nextLevel2 = new ArrayList<>();
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);

        addRight(a, b);
        addLeft(a, c);
        addRight(b, d);
        addLeft(b, e);
        addLeft(c, f);

        //TreeNode second = a;
        TreeNode a2 = new TreeNode(1);
        TreeNode b2 = new TreeNode(2);
        TreeNode c2 = new TreeNode(3);
        TreeNode d2 = new TreeNode(4);
        TreeNode e2 = new TreeNode(5);
        TreeNode f2 = new TreeNode(6);

        addRight(a2, b2);
        addLeft(a2, c2);
        addRight(b2, d2);
        //addLeft(b2, e2);
        //addLeft(c2, f2);
        System.out.println(isSameTree(a, a2));
    }
}


