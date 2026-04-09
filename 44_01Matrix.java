import java.util.LinkedList;
import java.util.Queue;

class Solution {

    class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Queue<Pair> q = new LinkedList<>();

        // Step 1: init
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new Pair(i, j));
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        // Step 2: BFS
        while (!q.isEmpty()) {
            Pair cur = q.poll();

            for (int[] d : dirs) {
                int nx = cur.x + d[0];
                int ny = cur.y + d[1];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    if (mat[nx][ny] > mat[cur.x][cur.y] + 1) {
                        mat[nx][ny] = mat[cur.x][cur.y] + 1;
                        q.offer(new Pair(nx, ny));
                    }
                }
            }
        }

        return mat;
    }
}