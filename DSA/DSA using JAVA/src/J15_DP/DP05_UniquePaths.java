package J15_DP;

public class DP05_UniquePaths {
//    here is a robot on an m x n grid. The robot is initially located in the top-left corner (i.e., grid[0][0]).
//    The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down
//    or right at any point in time.
//    Given the two integers m and n, return the number of possible unique paths
    public static void main(String[] args){
        int m = 3, n = 7;
        int[][] dp= new int[m][n];

        int[] dp2=new int[n];// can also use 1-D array
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<n;j++){
            dp[0][j]=1;
            dp2[j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j] + dp[i][j-1];
                dp2[j]= dp2[j] + dp2[j-1];
            }
        }
        System.out.println(dp[m-1][n-1]);
        System.out.println(dp2[n-1]);
    }
}
