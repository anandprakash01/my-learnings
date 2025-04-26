package A_PracticeCode;
import java.util.*;
class Solution {
    //subsets;
    public static void main(String args[]){
        int nums[]={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        sub(nums,0,ans,new int[nums.length],0);
        System.out.println(ans);
        //using for loops also;
    }
    public static void sub(int[] nums,int i,List<List<Integer>> ans,int[] a, int idx){
        if(i>=nums.length) {
            List<Integer> temp = new ArrayList<>();
            for(int k = 0; k < idx; k++) {
                temp.add(a[k]);
            }
            ans.add(temp);
            return;
        }
        //for no
        sub(nums,i+1,ans,a,idx);

        //for yes
        a[idx]=nums[i];
        sub(nums,i+1,ans,a,idx+1);

        return;

    }
}