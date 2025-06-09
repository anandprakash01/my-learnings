package J03_Arrays;

public class A4_MaxSubarraysSum {
    public static void main(String args[]){
        int[] a={3,2,-1,9,-2,-1,-19,6,1,5};
        int[] b={1,-2,6,-1,-3};
        maxSubarraySum(a);
        kadanesAlgo(a);
        maxSumPrefixApproach(a);
    }
    public static void maxSubarraySum(int[] a){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        int start=0, end=0;
        for(int i=0;i<a.length;i++){        //Time complexity O(n^3)
            for(int j=i;j<a.length;j++){
                currentSum=0;
                for(int k=i;k<=j;k++){
                    currentSum=currentSum+a[k];
                }
//                System.out.print(currentSum+ ", ");
                if(currentSum>maxSum){
                    maxSum=currentSum;
                    start=i;
                    end=j;
                }
                //maxSum=Math.max(currentSum,maxSum);
            }
        }
        System.out.println("\nmaxSum = " + maxSum );
        System.out.println("And the subarray is from "+start+" to "+end);
        System.out.print("Subarray is : ");
        for(int i=start;i<=end;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static void maxSumPrefixApproach(int[] a){
        int[] prefixSum=new int[a.length];
        int cs=0;                               //Time complexity O(n^2)
        int maxsum=Integer.MIN_VALUE;
        prefixSum[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefixSum[i]=prefixSum[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){        //i==Starting point
            for(int j=0;j<a.length;j++){    //j==ending point
                cs= i==0? prefixSum[j] : prefixSum[j]-prefixSum[i-1];
                maxsum=Math.max(maxsum,cs);
            }
        }
        System.out.println(maxsum);
    }
    public static void kadanesAlgo(int[] a){ //time complexity O(n)
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<a.length;i++){
            cs=cs+a[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms,cs);
        }
        System.out.println(ms);
    }
}
