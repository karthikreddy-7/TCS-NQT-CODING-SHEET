package Previously_Asked_Coding_Question;

/*
 * Problem Statement:
Given a grid of size m*n, let us assume you are starting at (1, 1) and your goal is to reach (m, n).
At any instance, if you are on (x, y), you can either go to (x, y + 1) or (x + 1, y).
Now consider if some obstacles are added to the grids.
How many unique paths would there be? An obstacle and space are marked as 1 and 0 respectively in the grid.
sample test case n=3,m= 3
arr = [
[0 0 0],
[0 1 0],
[0 0 0]
]
output: 2
 */
public class prev5 {
    public static void main(String[] args) {
        int[][] maze = {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };
        int m = 3;
        int n = 3;
        int ways = findways(maze, m, n);
        System.out.println(ways);
    }

    static int findways(int[][] maze, int m, int n) {
        return findwaysRecursively(maze, m, n, 0, 0);
    }

    static int findwaysRecursively(int[][] maze, int m, int n, int curx, int cury) {
        if (curx >= m || cury >= n || maze[curx][cury] == 1)
            return 0;
        if (curx == m - 1 && cury == n - 1)
            return 1;
        return findwaysRecursively(maze, m, n, curx + 1, cury) + findwaysRecursively(maze, m, n, curx, cury + 1);
    }
}
