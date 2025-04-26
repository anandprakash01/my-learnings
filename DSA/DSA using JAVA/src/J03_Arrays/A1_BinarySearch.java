package J03_Arrays;

public class A1_BinarySearch {

    // Binary Search
    public static int binarysearch(int[] arr,int key){  //O(log n)
        // Array should be sorted for binary search
        int left=0;
        int right=arr.length-1;
        while(left <= right){
//            int mid=(l+r)/2;
            int mid = left + ((right - left) / 2);
            if(arr[mid] == key){
                System.out.println("Element is found at : " + mid);
                return 0;
            }
            if(arr[mid] < key){
                left=mid+1;
            }
            if(arr[mid] > key){
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        //int arr[]=new int[5];
        int arr[]={1,3,5,6,9,10,15,19,21,25,27,55};

        int key=10;
        if(binarysearch(arr,key)==-1){
            System.out.println("Element is Not found");
        }
    }
}


