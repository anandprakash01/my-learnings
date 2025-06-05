package J03_Arrays;

public class A1_BinarySearch {
    // Binary Search
    public static void binarySearch(int[] arr,int target){
        int left= 0;
        int right=arr.length-1;
        while(left<=right){
            int mid= left + ((right - left))/2;
            if(arr[mid] == target){
                System.out.println("Element Found at : " + mid);
                return ;
            }
            else if(arr[mid] < target){
                left= mid+1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println("Element Not Found");

    }
    public static void main(String args[]){
        //int arr[]=new int[5];
        int[] arr={1,3,5,6,9,10,15,19,21,25,27};
        int key=27;
        binarySearch(arr,key);
    }
}


