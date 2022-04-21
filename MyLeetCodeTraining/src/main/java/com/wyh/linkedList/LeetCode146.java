package com.wyh.linkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 实现LRU缓存 ： 1.头部插入 2.尾部删除 3.访问元素后，从中间删除 4.访问元素 是否存在
 * 建立一个类似索引的数据结构 用来索引
 */

public class LeetCode146 {
    private Map<Integer,Node> nodeMap = new HashMap<>();
    private int size;
    private int capacity;
    private Node head,tail;

    public LeetCode146(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
    }
//维护Head 与 Tail，保证Map里的对象与deque一一对应
    public int get(int key) {
        Node node = nodeMap.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    private void moveToHead(Node node) {
        remove(node);
        //添加到队头
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    public void put(int key, int value) {
        Node node = nodeMap.get(key);
        if (node == null) {
            Node newNode = new Node(key, value);
            nodeMap.put(key, newNode);
            moveToHead(newNode);
            ++size;
            //超过容量，开始淘汰
            if (size > capacity) {
                Node tail = removeTail();
                nodeMap.remove(tail.key);
                --size;
            } else {
                node.value = value;
                moveToHead(node);
            }
        }
    }

    private Node removeTail() {
        Node node = tail.pre;
        remove(node);
        return node;
    }

    private void remove(Node node) {
        //删除
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

}
