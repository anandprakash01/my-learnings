package J15_DP;

import java.util.Arrays;

public class DP06_UniquePath {
//    from the top-left corner move to the bottom-right corner (i.e., grid[m-1][n-1]).
//    you can only move either down or right at any point in time.
//    if 1 you can not go if 0 you can go;
    public static void main(String[] args){
        int[][] grid = {{0, 0, 0},
                        {0, 1, 0},
                        {0, 0, 0}};

        int m=grid.length;// row
        int n=grid[0].length;// column
        if(grid[0][0]==1 || grid[m-1][n-1]==1){
            System.out.println("No valid path exists.");
            return;
        }
        int[] dp=new int[n];
        dp[0]=1;
        // dp[j] will store the number of unique paths
        // to reach the cell in the current row at column j.
        for(int j=1;j<n;j++){
            if(grid[0][j]!=1){
                dp[j]=1;
            }
//            else zero
        }
        // for the rest of the rows.
        for(int i=1;i<m;i++){
            if(grid[i][0]==1) dp[0]=0;
            for(int j=1;j<n;j++){
               if(grid[i][j]==1){
                   dp[j]=0;
               }
               else{
                   // dp[j] will store its upper cell
                   // dp[j-1] will store its left cell
                   dp[j]=dp[j]+ dp[j-1]; // upper cell + left cell
               }
            }
        }
        System.out.println(dp[n-1]);

        dpSol2(grid);
        int[][] memo=new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        System.out.println(getUniquePaths(grid,0,0,memo));
        System.out.println(memo[0][0]);
    }
    public static int getUniquePaths(int[][] grid,int i,int j,int[][] memo){
        // memoized solution
        int m=grid.length;//row
        int n=grid[0].length;//col
        if(i>=m || j>= n || grid[i][j]==1) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(memo[i][j] != -1){
            return memo[i][j];
        }
        return memo[i][j]= getUniquePaths(grid,i+1,j,memo) + getUniquePaths(grid,i,j+1,memo);

    }
    public static void dpSol2(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp = new int[m][n];

        // Initialize base case: If the starting cell is reachable, set it to 1
        dp[0][0] = 1;

        // Fill the DP table
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) continue; // Skip obstacle cells
                if (i > 0) dp[i][j] += dp[i-1][j]; // Add paths from above
                if (j > 0) dp[i][j] += dp[i][j-1]; // Add paths from left
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
