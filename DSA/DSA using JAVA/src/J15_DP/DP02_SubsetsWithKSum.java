package J15_DP;

public class DP02_SubsetsWithKSum {
//    Given an array arr of non-negative integers and an integer target, the task is to count all
//    subsets of the array whose sum is equal to the given target.

    public static int recursiveSol(int[] nums,int n,int sum){
//        if(target==0) return 1;
//        if(n==0) return 0;

        if(n==0){
//            The decision to return 1 (for target == 0) is only made when all elements (n==0) have been considered.
//            it will check till n==0, even if the array int are zero. we can include or exclude them.
            return sum == 0 ? 1 : 0;// this will handle 0
        }
        if(nums[n-1] > sum){
            return recursiveSol(nums,n-1,sum);
        }
        return recursiveSol(nums,n-1,sum-nums[n-1]) + recursiveSol(nums,n-1,sum);
    }

    public static void main(String[] args){
//        int[] nums={2,3,7,8,10};
//        int sum=10;

        int[] nums={28, 4, 3, 27, 0, 24, 26};
        int sum=24;

        int n=nums.length;
        System.out.println(recursiveSol(nums,n,sum));

        int[][] dp=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++){// setting row
            dp[i][0]=1;// for sum 0 it can be formed using empty subset
        }
        for(int j=1;j<sum+1;j++){//i==1; setting col
            dp[0][j]=0;// for empty array sum can not be form
        }

//        with arr = {0}, subsets summing to 0 are {} and {0} (count should be 2), but this initialization would lead to 1
//        so start sum (j) from 0;
        for(int i=1;i<n+1; i++){
            for(int j=0;j<sum+1;j++){
                if(nums[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }
                else if(nums[i-1] <=j){
                    dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][sum]);

    }
}
