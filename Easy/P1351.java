package Easy;

public class P1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid[0].length;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] < 0){
                    count += m - j;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}};
        P1351 p = new P1351();
        System.out.println(p.countNegatives(grid));
    }
}
