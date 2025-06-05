package J15_DP;

public class DP03_SubsetsWithKSumTrueFalse {
    // if any subsets sums up to the target return true else false
    public static void main(String[] args){
        int[] arr={2,3,7,8,10};
        int target=11;
        int n=arr.length;
        boolean[][] dp=new boolean[n+1][target+1];

        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }
        for(int j=1;j<target+1;j++){
            dp[0][j]=false;
        }

        for(int i=1;i<n+1;i++){
            for(int j=0;j<target+1;j++){
                if(arr[i-1] > j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]= dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
            }
        }
        System.out.println(dp[n][target]);


    }
}
