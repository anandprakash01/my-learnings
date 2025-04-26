package A_PracticeCode;

public class ClimbingStairs {
//    You are climbing a staircase. It takes n steps to reach the top.
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//    Input: n = 3
//    Output: 3
//    Explanation: There are three ways to climb to the top.
//    1. 1 step + 1 step + 1 step
//    2. 1 step + 2 steps
//    3. 2 steps + 1 step
    public static void main(String[] args){
        int n=8;

        if(n<=2) System.out.println(n);
        int temp=0;
        int first=1;
        int second=2;
        for(int i=3;i<=n;i++){
            temp=second;
            second+=first;
            first=temp;
        }

        // Same with better writing
        int minus1 = 2;
        int minus2 = 1;
        int curr = 3;
        int ans=0;
        while (curr <= n) {
            ans = minus1 + minus2;
            if (curr == n) {
                break;
            }
            curr++;
            minus2 = minus1;
            minus1 = ans;
        }

        // using Array to store
        int[] dp=new int[n+1];//dynamic programing
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        System.out.println(ans);
        System.out.println(dp[n]);
        System.out.println(second);
        System.out.println(solRecursion(n));

    }
    public static int solRecursion(int n){
        if(n<=2) return n;
        return solRecursion(n-1)+solRecursion(n-2);
    }

}
