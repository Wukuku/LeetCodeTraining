package com.wyh.alg.stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @Author wu yuhao
 * @Date 2022/4/19
 * @Description
 */
public class LeetCode20 {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) return false;
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char a = s.charAt(i);
            if (pairs.containsKey(a)) {
                if (stack.isEmpty() || stack.peek().equals(pairs.get(a))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(a);
            }
        }
        return stack.isEmpty();
    }
}
