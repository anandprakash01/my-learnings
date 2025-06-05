package J03_Arrays;

import java.util.Arrays;

public class A13_MinPlateFormRequired {
//    You are given the arrival times arr[] and departure times dep[] of all trains that arrive at
//    a railway station on the same day.
//    Your task is to determine the minimum number of platforms required at the station to ensure that
//    no train is kept waiting. At any given time, the same platform cannot be used for both the arrival
//    of one train and the departure of another. Therefore, when two trains arrive at the same time,
//    or when one arrives before another departs, additional platforms are required to accommodate both trains

    public static void main(String[] args){
//        int[] arr = {900, 940, 950, 1100, 1500, 1800};
//        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        int[] arr = {900, 1235, 1100} ;
        int[] dep={1000, 1240, 1200};
        int n=arr.length;
        if(n==0) return;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plateFormsInUse=0;
        int minPlateFormsRequired=0;
        int i=0;// arr
        int j=0;// dep
        while(i<n){
            if(j == n || arr[i]<=dep[j]){
                plateFormsInUse++;
                i++;
            }
            else{
                plateFormsInUse--;
                j++;
            }
            minPlateFormsRequired=Math.max(plateFormsInUse,minPlateFormsRequired);
        }
        System.out.println(minPlateFormsRequired);
    }
}
