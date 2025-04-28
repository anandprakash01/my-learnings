package J18_Hashing;

import java.util.HashMap;
import java.util.Map;

public class H_TwoSum {

    // Given an array of integers nums and an integer target, return indices of the two numbers
    // such that they add up to target.(exactly one solution)
    public static void main(String[] args){
        int[] nums = {2,7,11,15}; //Output: [0,1]
        int target = 9;

        Map<Integer,Integer> check=new HashMap<>();// O(n)
        for(int i=0;i<nums.length;i++){
            if(check.containsKey(target-nums[i])){
                System.out.println(check.get(target-nums[i]) +" " + i);
                return;
            }
            check.put(nums[i],i);
        }
        System.out.println("No target Sum");

    }
}
