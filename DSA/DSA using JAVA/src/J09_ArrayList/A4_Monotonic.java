package J09_ArrayList;

import java.util.ArrayList;

public class A4_Monotonic {
    /* An Arraylist is monotonic if it is either increasing or monotone decreasing.
     An Arraylist nums is monotonic increasing if for all i<=j,nums.get(i)<=nums.get(j).
     An Arraylist nums is monotonic decreasing if for all i <= j, nums.get(i) >= nums.get(j).
     Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise. */
    public static boolean monotonic(ArrayList<Integer> arrlist){
        boolean incre=true;
        boolean decre=true;
        for(int i=1;i<arrlist.size();i++){
            if(arrlist.get(i-1)>arrlist.get(i)){
                incre=false;
            }
            if(arrlist.get(i-1)<arrlist.get(i)){
                decre=false;
            }
        }
        return incre || decre;
    }

    public static void main(String[] args){
        ArrayList<Integer> arrlist=new ArrayList<>();
        arrlist.add(9);
        arrlist.add(8);
        arrlist.add(4);
        arrlist.add(2);
        arrlist.add(0);
        System.out.println(monotonic(arrlist));

    }

}
