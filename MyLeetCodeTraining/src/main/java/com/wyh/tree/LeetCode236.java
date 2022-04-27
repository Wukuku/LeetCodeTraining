package com.wyh.tree;

/**
 * @Author wu yuhao
 * @Date 2022/4/28
 * @Description 公共祖先
 */
public class LeetCode236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root, p.val, q.val);
    }
    TreeNode find(TreeNode root, int val, int val2) {
        if (root == null) return null;
        if (root.val == val || root.val == val2) return root;
        TreeNode left = find(root.left, val, val2);
        TreeNode right = find(root.right, val, val2);
        if (left != null && right != null) return root;
        return left == null ? left : right;
    }
}
