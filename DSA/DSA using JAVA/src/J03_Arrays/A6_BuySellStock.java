package J03_Arrays;

public class A6_BuySellStock {
    public static void main(String[] args){
        int[] a={7,1,5,3,6,4};
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>buyprice){          //Today's selling price a[i]
                int profit=a[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buyprice=a[i];
            }
        }
        System.out.println(maxprofit);
    }
}


