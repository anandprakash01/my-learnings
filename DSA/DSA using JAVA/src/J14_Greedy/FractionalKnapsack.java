package J14_Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    /*  given the weight and values of n items,put these in a knapsack(bag or something) of capacity w to
        get max value in the knapsack   */
    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int w=50;
        double[][] ratio = new double[value.length][2];
        for(int i=0;i<value.length;i++){
            // 0th ---> index   1st-->ratio colum
            ratio[i][0]=i;
            ratio[i][1]= value[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); //sorting in basis of ratio column
        int maxval=0;
        int capacity=w;

        //it's sorted in ascending order, but we need the max ratio first ie weight is min and value is high

        for(int i=ratio.length-1;i>=0;i--){
            int idx= (int)ratio[i][0];
            if(capacity>=weight[idx]){  //for including full item
                maxval+=value[idx];
                capacity-=weight[idx];
            }else{                      //for including fraction (left capacity)
                maxval+= ratio[i][1]*capacity;
                capacity=0;
                break;
            }
        }
        System.out.println(maxval);
    }
}
