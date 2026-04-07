class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int origin = image[sr][sc];
        
        if(origin == color) return image;

        dfs(image, sr, sc, color, origin);
        
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int origin) {

        int m = image.length;
        int n = image[0].length;

        if(sr < 0 || sc < 0 || sr >= m || sc >= n) return;

        if(image[sr][sc] != origin) return;

        image[sr][sc] = color;

        dfs(image, sr + 1, sc, color, origin);
        dfs(image, sr - 1, sc, color, origin);
        dfs(image, sr, sc + 1, color, origin);
        dfs(image, sr, sc - 1, color, origin);
    }
}