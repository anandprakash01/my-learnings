package J04_2DArrays;

public class A4_DiagonalTrivarsal {
//    498. Diagonal Traverse(leetCode)-medium
//    Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
    public static void main(String[] args){
       int[][] matrix ={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
//        Output: [1,2,4,7,5,3,6,8,9]
        diagonal(matrix);
    }
    public static void diagonal(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        int[] a=new int[m*n];
        int k=0;//indices for new array;
        int i=0,j=0;
        boolean up=true;
        int cnt=0;
        while(cnt<m*n){
            if(up){
                for(;i>=0 && j<n;i--,j++){
                    a[k++]=mat[i][j];
                    cnt++;
                }
                up=false;
                if(i<0 && j<n)
                    i=0;
                if(j==n){
                    i=i+2;
                    j--;
                }
            }
            else{
                for(;i<m && j>=0;i++,j--){
                    a[k++]=mat[i][j];
                    cnt++;
                }
                up=true;
                if(j<0 && i<m)
                    j=0;
                if(i==m){
                    j=j+2;
                    i--;
                }
            }
        }
        for(i=0;i<m*n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
