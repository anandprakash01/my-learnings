package J03_Arrays;

public class A9_SearchSortedRotedArr {

    public static void main(String[] args){
        int[] arr={4,5,7,8,0,1,2,3};
        int n=arr.length;
        int target=3;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left + (right-left)/2;
            if(arr[mid]==target){
                System.out.println("Found at : "+ mid);
                return;
            }
            if(arr[left] <= arr[mid]){//left sorted
                if(arr[left] <= target && target <= arr[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{ // right sorted (arr[mid] > arr[end] )
                if(arr[mid] <= target && target <= arr[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        System.out.println("Not found");
    }
}
