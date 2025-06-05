package J03_Arrays;

public class A11_RemoveDuplicates {
//    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
//    such that each unique element appears only once. The relative order of the elements should be
//    kept the same. Then return the number of unique elements in nums.
//    Change the array nums such that the first k elements of nums contain the unique elements
//    in the order they were present in nums initially

    public static void main(String[] args){
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int k=sol(nums);
        for(int i=0;i<k;i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static int sol(int[] nums){
//        int i=0;
//        int j=1;
//        while(j<nums.length){
//            if(nums[i]==nums[j]){
//                j++;
//            }
//            else{
//                nums[++i]=nums[j++];
//            }
//        }
//        return i+1;

//         Same logic with different writing
        int k=0;
        for(int x=0;x<nums.length-1;x++){
            if(nums[x]!=nums[x+1]){
                nums[++k]=nums[x+1];
            }
        }
        return k+1;
    }

}
