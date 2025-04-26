package J03_Arrays;

public class A3_SubArraysSum {

    public static void allPairs(int arr[]){//contiguous pairs
        int total=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ arr[i]+ ","+ arr[j]+"), ");
                total++;
            }
        }
        System.out.println("Total no of Pairs = "+total);
    }
    public static void PrintallSubarrays(int a[]){
        int ts=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k] + ", ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println("Total no of Subarrays = "+ts);
    }


    public static void main(String args[]){
        int a[]={3,2,6,1,5};
        int b[]={1,-2,6,-1,-3};
//        allPairs(a);
//        PrintallSubarrays(a);
//        maxSubarraySum(b);
    }
}

