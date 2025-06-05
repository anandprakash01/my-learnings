package J03_Arrays;

public class A2_ReverseArray {
    public static void reverseArr(int[] arr){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args){
        //int arr[]=new int[6];
        int[] arr ={5,6,3,7,17,34,1};
//        reverse(arr);
        reverseArr(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

