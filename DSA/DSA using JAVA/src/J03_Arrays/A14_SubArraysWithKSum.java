package J03_Arrays;

import java.util.HashMap;
import java.util.Map;

public class A14_SubArraysWithKSum {
//    Given an array arr of integers and an integer target, the task is to count all subarrays of the array
//    whose sum is equal to the given target.
    public static void main(String[] args){
        int[] nums={1,2,3,-3,1,1,1,4,2,-3};
        prefixSumApproach(nums);
        subArraysSum(nums);
    }
    public static void prefixSumApproach(int[] nums){// Time:O(n) Space O(n)
        int prefixSum=0;
        int k=3;
        Map<Integer,Integer> map=new HashMap<>();// to store the remaining sum occurred previously
        int cnt=0;
        map.put(0,1);
        for(int num:nums){
            prefixSum+=num;
            int remainingSum=prefixSum-k;
            if(map.containsKey(remainingSum)){
                cnt+=map.get(remainingSum);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0) +1);
        }
        System.out.println("Total no of sub arrays with k sum: "+cnt);
    }
    public static void subArraysSum(int[] nums){// Time O(n)

    }
}
