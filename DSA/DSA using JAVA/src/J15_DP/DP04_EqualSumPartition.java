package J15_DP;

public class DP04_EqualSumPartition {
    // can it be divided into two subsets such that sum is equal for both parts
    // return true or false;
    public static void main(String[] args){
        int[] arr={1,5,11,5};// {1,5,5} and {11} sum=11
        int n=arr.length;

        // if total sum is even then only we can divide it to two equal parts
        // if one parts sum is 15 and total is 30 then second part will also be 30;
        // so we have to check only for one subset has sum or not
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        if(sum%2 != 0){
            System.out.println("Not possible");
            return;
        }
        sum /= 2;
        boolean[][] dp=new boolean[arr.length+1][sum+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }
        for(int j=1;j<sum+1;j++){
            dp[0][j]=false;
        }

        for(int i=1;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(arr[i-1] > j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
            }
        }

        System.out.println(dp[n][sum]);
    }
}
