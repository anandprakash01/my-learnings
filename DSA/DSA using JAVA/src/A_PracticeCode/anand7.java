package A_PracticeCode;

import java.util.Scanner;

public class anand7 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=5;
        long y;
        long x=1;
        long z=n;
        long minNo=0;
        long min=Integer.MAX_VALUE;
        while(z>0){
            y=0;
            while(y<x){
                long no=(1<<x)+(1<<y);
                long abs=Math.abs(n-no);
                if(abs<min){
                    min=abs;
                    minNo=no;
                }
                y++;
                z--;
                if(z<=0){
                    System.out.println(minNo);
                    return;
                }
            }
            x++;
        }
        System.out.println(minNo);
    }
}
