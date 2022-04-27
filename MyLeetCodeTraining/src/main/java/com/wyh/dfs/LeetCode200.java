package com.wyh.dfs;

/**
 * @Author wu yuhao
 * @Date 2022/4/26
 * @Description 岛屿数量
 */
public class LeetCode200 {
    public int numIslands(char[][] grid) {
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    backTract(grid, i, j);
                }
            }
        }
    }
    void backTract(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || j < 0 || i > m || j > n) {
            return;
        }
        if (grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        backTract(grid, i - 1, j);
        backTract(grid, i + 1, j);
        backTract(grid, i, j + 1);
        backTract(grid, i, j - 1);
    }
}
