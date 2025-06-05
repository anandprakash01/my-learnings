package J15_DP;

public class DP01_Knapsack {
    // 0-1 Knapsack
    // there is a bag of fixed capacity and some items with weights and its value, find max value that can be put inside bag.
    public static int recursiveSol(int[] val,int[] wt,int w,int n){
        if(n==0 || w==0){
            return 0;
        }
        if(wt[n-1] > w){
            return recursiveSol(val,wt,w,n-1);// element can not be included
        }
        // two choices ( either include or not include )
        // wt[n-1] <=  w    // element included
        return Math.max(val[n-1] + recursiveSol(val,wt,w-wt[n-1], n-1), recursiveSol(val,wt,w,n-1));
    }

    public static int memoizationSol(int[] val,int[] wt, int w, int n,int[][] dp){
        if(n==0 || w==0){
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if(wt[n-1] > w){
            return dp[n][w]= memoizationSol(val,wt,w,n-1, dp);
        }
        return dp[n][w]=Math.max(val[n-1] +  memoizationSol(val,wt,w-wt[n-1],n-1,dp),
                memoizationSol(val,wt,w,n-1,dp));
    }


    public static void main(String[] args){
        int[] value={1,4,5,7};
        int[] wt={1,3,4,5};
        int w=7;
        int n=value.length;

        int maxValue=recursiveSol(value,wt,w,n);
        System.out.println(maxValue);

        int[][] dp=new int[n+1][w+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                dp[i][j]=-1;
            }
        }
        maxValue= memoizationSol(value,wt,w,n,dp);
        System.out.println(maxValue);

        // DP solution
        for(int i=0;i<n;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<w;j++){
            dp[0][j]=0;
        }

//        n----> i  //replace
//        w----> j
        for(int i=1; i<n+1; i++){
            for(int j=1; j<w+1; j++){
                if(wt[i-1] > j){
                    dp[i][j]=dp[i-1][j];
                }
                else {
                    dp[i][j]= Math.max(value[i-1] + dp[i-1][j-wt[i-1]] , dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}
