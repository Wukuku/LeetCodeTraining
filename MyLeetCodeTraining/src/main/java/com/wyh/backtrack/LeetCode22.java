package com.wyh.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wu yuhao
 * @Date 2022/4/26
 * @Description 括号生成
 */
public class LeetCode22 {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backTrack(new StringBuilder(""), 0, 0);
        return res;
    }

    void backTrack(StringBuilder cur, int left, int right) {
        if (right < left) return;
        if (left < 0 || right < 0) return;
        if (left == 0 && right == 0) {
            res.add(cur.toString());
            return;
        }
        cur.append('(');
        backTrack(cur,left - 1, right);
        cur.deleteCharAt(cur.length() - 1);

        cur.append(')');
        backTrack(cur,left, right - 1);
        cur.deleteCharAt(cur.length() - 1);
    }
}
