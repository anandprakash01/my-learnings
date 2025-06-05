package J03_Arrays;

public class A8_Sorting {
    // inbuilt fun---->Arrays.sort(arr)
    public static void main(String[] args){
        int[] arr={3,5,6,9,2,3,8,1,0,3,-100};
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
        countSort(arr);
        //    ======>>Inbuilt fun-----> Arrays.sort(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void bubbleSort(int[] arr){     //O(n^2)
//         bigger element bubbles up
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr){      //O(n^2)
//        selects the minIndex then swap it
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex] > arr[j]){
                   minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public static void insertionSort(int[] arr){      //O(n^2)
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int pre=i-1;
            while(pre>=0 && arr[pre]>curr){
                arr[pre+1] = arr[pre];
                pre--;
            }
            arr[pre+1]=curr;
        }
    }
    public static void countSort(int[] a){      //for small range and non-negative
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(largest,a[i]);
        }
        int[] count=new int[largest+1];
        for(int i=0;i<largest;i++){
            count[a[i]]++;
        }
        // for(int i=0;i<largest;i++){
        //     System.out.println(count[i]);
        // }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                count[i]--;
                j++;
            }
        }
    }
}
