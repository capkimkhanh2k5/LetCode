import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public class Pair {
        int x,y;
        Pair(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        // public int getX(){
        //     return this.x;
        // }
        // public int getY()
        // {
        //     return this.y;
        // }
    };

    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> q = new LinkedList<>();

        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i ++)
        {
            for (int j = 0; j < n; j ++)
            {
                if(mat[i][j] == 0)
                {
                    q.offer(new Pair(i, j)); //Lưu vị trí có gtri 0
                }
            }
        }

        //Lấy các giá trị 0 và tiến hành đệ quy tìm minStep

        return null;
    }


    public void update(int[][] mat, int m, int n, int x, int y)
    {
        if(x < 0 || x >= m || y < 0 || y >= n)
        {
            return;
        }
        
        if(mat[x][y] != 0)
        {
            
        }

    }
}