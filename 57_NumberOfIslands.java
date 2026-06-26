class Solution {
    int [][] hisWay;

    public int numIslands(char[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        hisWay = new int[rows][cols];

        for (int i = 0; i <= rows; i ++)
        {
            for (int j = 0; j <= cols; j ++)
            {
                if (!hisWay.equals(new int [i][j])){

                }
            }
        }

        return 0;
    }

    private int checkIslands(char[][] grid, int row, int col)
    {
        int left = 0, right = 0, up = 0, down = 0;
        if(grid[row][col] == 0)
        {
            
        }

    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        Solution solution = new Solution();
        int result = solution.numIslands(grid);
        System.out.println(result); // Expected output: 3
    }
}