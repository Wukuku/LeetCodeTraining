package com.wyh.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author wu yuhao
 * @Date 2022/4/27
 * @Description N叉树的前序遍历
 */
public class LeetCode589 {
    List<Integer> ans = new ArrayList<>();
    Deque<Node> stack = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) return ans;
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            ans.add(node.val);
            List<Node> children = node.children;
            for(int i = children.size() - 1; i >= 0; i--) {
                stack.push(children.get(i));
            }
        }
        return ans;
    }
}
