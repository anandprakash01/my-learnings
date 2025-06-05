package J04_2DArrays;

public class A3_DiagonalSum {
    public static void main(String args[]){
//         int[][] matrix={{3, 4, 2, 1},
//                         {2, 3, 4, 7},
//                         {3, 8, 2, 1},
//                         {4, 4, 3, 2}};
        int[][] matrix={{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        diagonalSum(matrix);
        diagonalSumOptimized(matrix);
    }
    public static void diagonalSumOptimized(int[][] a){ // Time:O(n)
//        if the diagonal element repeat this does not count that like 5 in matrix of 3 x 3
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i][i];// primary diagonal
            if(i!=n-1-i){
                sum+=a[i][n-1-i];
            }
        }
        System.out.println(sum);
    }
public static void diagonalSum(int[][] a){ // Time:O(n²)
        int n=a.length;
        //int m=a[0].length;
        int sum=0;
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 //for primary diagonal
                 if(i==j){
                     sum+=a[i][j];
                 }
                 //for secondary diagonal
                 if(i+j==n-1){
                     sum+=a[i][j];
                 }
             }
         }
        System.out.println(sum);
    }
}
