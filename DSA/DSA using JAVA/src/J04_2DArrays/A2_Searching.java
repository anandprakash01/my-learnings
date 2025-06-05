package J04_2DArrays;

import java.util.ArrayList;

public class A2_Searching {
//    Write an efficient algorithm that searches for a value target in an m x n integer matrix.
//    This matrix has the following properties:
//    Integers in each row are sorted in ascending from left to right.
//    Integers in each column are sorted in ascending from top to bottom.
    public static void main(String[] args){
        // for only sorted matrix
        // int[][] matrix={{3,4,2,1},
        //                 {2,3,4,7},
        //                 {3,8,2,1},
        //                 {4,4,3,2}};
        int[][] matrix={{2,3,4,6},
                        {4,5,6,7},
                        {5,6,7,8},
                        {6,9,10,11}};
        int target=7;
        search(matrix,target);
    }
    public static void search(int[][] arr,int key){ // O(m+n)
        int m = arr.length-1;// Row
        int n = arr[0].length-1; // Column
        // either start from top right corner
        // or start from bottom left corner
        int i=0;
        int j=n;
        ArrayList< ArrayList<Integer>> indexes= new ArrayList<>();// to store all the indexes
        while(i<=m && j>=0){
            if(arr[i][j]==key){
                System.out.println("key fount at "+ i+","+j);
                ArrayList<Integer> index=new ArrayList<>();
                index.add(i);
                index.add(j);
                indexes.add(index);
            }
            if(key>arr[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(indexes);
    }
}
