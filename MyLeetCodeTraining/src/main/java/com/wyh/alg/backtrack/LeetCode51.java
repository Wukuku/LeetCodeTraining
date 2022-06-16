package com.wyh.alg.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author wu yuhao
 * @Date 2022/4/25
 * @Description N皇后
 */
public class LeetCode51 {
    private List<String> list;
    private List<List<String>> result;
    int n;
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        list = new ArrayList<>();
        result = new ArrayList<>();
        char[][] broad = new char[n][n];
        for (int i =0; i < n; i++) {
            Arrays.fill(broad[i], '.');
        }
        recur(broad, 0);
        return result;
    }
    private void recur(char[][] broad, int row) {
        if (list.size() == broad.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < broad.length; i++) {
            if (!isValid(broad, row, i)) {
                continue;
            }
            broad[row][i] = 'Q';
            list.add(new String(broad[row]));
            recur(broad, row + 1);
            broad[row][i] = '.';
            list.remove(list.size() - 1);
        }

    }
    private boolean isValid(char[][] broad, int row, int col) {
        int n = broad.length;
        for (int i = 0; i < n; i++) {
            if (broad[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (broad[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (broad[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
