package Problem2;

import Problem1.TreeNode;

public class LCA {
    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        // homework
        // hint: pay attention to the assumptions of this problem.

        if (root.val == p.val || root.val == q.val)
            return root;

        TreeNode<Integer> left = null;
        if (root.left != null)
            left = lowestCommonAncestor(root.left, p, q);

        TreeNode<Integer> right = null;
        if (root.right != null)
            right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null)
            return root;
        else if (left == null && right == null)
            return null;
        else
            return (right == null) ? left : right;
        //This is my first time attempting to use this ? operator, I remember seeing it somewhere a while back.
        //Is it worth using here or unnecessary?
    }
}
