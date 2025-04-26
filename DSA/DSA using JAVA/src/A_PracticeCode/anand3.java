package A_PracticeCode;

import java.util.*;
public class anand3 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int b[]=new int[n];
        int c[]=new int[n];
        int count=1;
        int maxCount=1;
        int idx=-1;
        for(int i=0;i<n-1;i++){
            count=1;
            for(int j=0;j<n;j++){
                b[j]=a[i][j];
                c[j]=a[i+1][j];
            }

            if(Arrays.equals(b,c)){
                count++;
            }
            for(int k=i+2;k<n;k++){ //checking how next many rows are equal to b
                for(int j=0;j<n;j++){
                    c[j]=a[k][j];
                }
                if(Arrays.equals(b,c)){
                    count++;
                }
            }
            if(count>=maxCount){
                maxCount=count;
                idx=i;//index for b that has max count
            }
        }
        count=0;
        if(maxCount>1){
            for(int j=0;j<n;j++){
                if(a[idx][j]==0){   //if it is zero then we can clean this
                    count++;
                }
            }
            System.out.print(count);
        }
        else{
            System.out.print(1);
        }
    }
}
