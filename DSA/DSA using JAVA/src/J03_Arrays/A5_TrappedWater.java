package J03_Arrays;

public class A5_TrappedWater {
//    Given n non-negative integers representing an elevation map where the width of each bar is 1,
//    compute how much water it can trap after raining.

    public static void main(String args[]){
        int[] height={3,2,0,4,2,1,3};
        int water=0;
        int n=height.length;
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        left[0]=height[0];
        right[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        for(int i=1;i<n-1;i++){
            int curr=Math.min(left[i],right[i])-height[i];
            if(curr>0){
                water+=curr;
            }
        }
        System.out.println(water);
    }
}
