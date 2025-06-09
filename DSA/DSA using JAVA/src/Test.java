import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Test {
    public static void main(String[] args){
        int[][] matrix={{1, 2, 3, 0},
                        {4, 5, 6, 0},
                        {7, 8, 9, 0}};
        int m= matrix.length;
        int n= matrix[0].length;
        int[] a={3,2,-1,9,-2,-1,-19,6,1,5};
        System.out.println(kadaneAlgo(a));
        System.out.println(prefixSum(a));

    }
    public static int kadaneAlgo(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int cs=0;
        for(int num:arr){
            cs+=num;
            if(cs<0){
                cs=0;
            }
            maxSum=Math.max(maxSum,cs);
        }
        return maxSum;
    }
    public static int prefixSum(int[] arr){
        int[] prefixSum= new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]=prefixSum[i-1] + arr[i];
        }
        int maxSum=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                cs= prefixSum[j];
                if(i!=0){
                    cs= prefixSum[j]-prefixSum[i-1];
                }
                maxSum=Math.max(cs,maxSum);
            }
        }
        return maxSum;
    }
}
