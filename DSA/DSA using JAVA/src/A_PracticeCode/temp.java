package A_PracticeCode;

public class temp {
    public static void main(String[] args){
        int[] arr ={1,3,5,6,9,10};
        int key=3;
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key){
                System.out.println("found: "+ arr[mid] + " at " + mid);
                return;
            }
            else if(arr[mid]>key){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println("not found");
    }
}
