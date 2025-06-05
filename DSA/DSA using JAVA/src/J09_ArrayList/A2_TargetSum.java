package J09_ArrayList;

import java.util.ArrayList;

public class A2_TargetSum {
    // find any pair in ArrayList that has target sum
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(12);
        // it is sorted ArrayList so we can use 2 pointer
        int target=23;
        int l=0;
        int r=list.size()-1;
        while(l<r){
            int sum=list.get(l)+list.get(r);
            if(sum==target){
                System.out.println(l +", "+ r +" index has target Sum");
                System.out.println(list.get(l) + " + " + list.get(r) + " = " + target);
                return ;
            }
            if(sum<target){
                l++;
            }else{
                r--;
            }
        }
        System.out.println("Sum does not found");
    }
}
