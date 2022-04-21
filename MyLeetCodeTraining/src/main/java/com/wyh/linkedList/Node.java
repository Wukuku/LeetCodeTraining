package com.wyh.linkedList;

/**
 * @Date 2022/4/21
 * @Description
 */
public class Node {
    Node pre;
    Node next;
    int value;
    int key;

    public Node() {
    }

    public Node(int thisKey, int thisValue) {
        key = thisKey;
        value = thisValue;
    }
}