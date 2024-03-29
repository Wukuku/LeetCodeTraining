package com.wyh.alg.tree;

import java.util.List;

/**
 * @Author wu yuhao
 * @Date 2022/4/27
 * @Description
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
