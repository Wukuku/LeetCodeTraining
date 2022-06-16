package com.wyh.alg.tree;

import java.util.*;

/**
 * @Author wu yuhao
 * @Date 2022/4/27
 * @Description
 */
public class LeetCode102 {
    List<List<Integer>> ans = new ArrayList<>();
    Deque<TreeNode> queue = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return ans;
        }
        queue.offer(root);
        while(!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode102 leetCode102 = new LeetCode102();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(leetCode102.levelOrder(root));
    }
}
