package J04_2DArrays;

import java.util.ArrayList;
import java.util.List;

public class A1_SpiralMatrix {
    public static void main(String[] args){
        int[][] matrix={{1, 2, 3, 0},
                        {4, 5, 6, 0},
                        {7, 8, 9, 0}};
        List<Integer> result=new ArrayList<>();
//        Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
        List<Integer> result2=new ArrayList<>();

        spiralOrder(matrix,result,result2);
        System.out.println(result);
        System.out.println(result2);
    }
    public static void spiralOrder(int[][] grid, List<Integer> result,List<Integer> result2){
        int m=grid.length;
        int n=grid[0].length;
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        int num=1;
        while(left<=right && top<= bottom){
            for(int i=left;i<=right;i++){
                result.add(grid[top][i]);
                result2.add(num++);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result.add(grid[i][right]);
                result2.add(num++);
            }
            right--;
            for(int i=right;i>=left;i--){
                if(top>bottom) break;
                result.add(grid[bottom][i]);
                result2.add(num++);
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                if(left>right) break;
                result.add(grid[i][left]);
                result2.add(num++);
            }
            left++;
        }
    }
}
