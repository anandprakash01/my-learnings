package J03_Arrays;

public class A12_MissingAndRepeatingNo {
//    Given an unsorted array Arr of size N of positive integers. One number 'A' from set
//    {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.
    public static void main(String[] args){
        int[] arr = {1,4,6,2,5,6,3,8,9};
        findTwoNumbers(arr);
        inPlaceModification(arr);
    }
    public static void inPlaceModification(int[] arr){ // Time:O(N) space:O(1)
//        "Marking Visited Elements" or "In-place Modification" technique.
        int n = arr.length;
        int missing = -1;
        int repeating = -1;
        for(int i=0; i<n; i++){
            // "arr[i] <= n" so for the index arr[i]-1 otherwise it will go indexOutOfBound
            int idx= Math.abs(arr[i])-1;
            if(arr[idx]<0){
                repeating= idx+1;
            }
            else{
                arr[idx] = -arr[idx];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                // if there would have been i+1 value element, then arr[i] would have never been negative
                missing = i+1;
            }
        }
        System.out.println("Repeating No : " + repeating);
        System.out.println("Missing No : " + missing);
    }
    public static void findTwoNumbers(int[] arr){ // Time:O(n) space:O(n)
        int n = arr.length;
        boolean[] seen=new boolean[n+1];
        int missing=-1;
        int repeating=-1;
        for(int i=0;i<n;i++){
            if(seen[arr[i]]){
                repeating=arr[i];
            }
            else{
                seen[arr[i]]=true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!seen[i]){
                missing=i;
                break;
            }
        }
        System.out.println("Repeating No : " + repeating);
        System.out.println("Missing No : " + missing);
    }
}
