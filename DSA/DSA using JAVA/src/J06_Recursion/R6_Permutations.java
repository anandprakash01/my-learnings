package J06_Recursion;

import java.util.ArrayList;
import java.util.List;

public class R6_Permutations {
//    Given an array nums of distinct integers, return all the possible permutations.
//    You can return the answer in any order.
//    if there are n numbers then total no of permutation will be n!
//    n=3, permutations=6
    public static void main(String[] args){
        int[] nums= {1,2,3}; // Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        getPermutation(nums,result,new ArrayList<Integer>());
        System.out.println(result);

    }
    public static void getPermutation(int[] nums, ArrayList<ArrayList<Integer>> result,ArrayList<Integer> curr){
        if(curr.size() == nums.length){
            result.add(new ArrayList<Integer>(curr));
            return;
        }
        for(int num:nums){
            if(!curr.contains(num)){
                curr.add(num);
                getPermutation(nums,result,curr);
//                curr.remove(curr.size()-1);
                curr.removeLast();// backTracking
            }
        }
    }
}
