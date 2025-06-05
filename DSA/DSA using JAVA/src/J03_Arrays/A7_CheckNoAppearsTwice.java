package J03_Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class A7_CheckNoAppearsTwice {
    public static void main(String[] args){
        int[] arr={2,3,5,1,10,11,8,10};
        System.out.println(checkNo(arr));// T: O(n) S:O(n)
//        using sorting
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                System.out.println("Duplicate");
                return;
            }
        }
        System.out.println("No Duplicate Found");
    }
    public static boolean checkNo(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        for(int num:arr){
            if(seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }
}

