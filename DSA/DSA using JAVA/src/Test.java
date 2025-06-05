import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Test {
    public static void main(String[] args){
        int[][] matrix={{1, 2, 3, 0},
                {4, 5, 6, 0},
                {7, 8, 9, 0}};
        int m= matrix.length;
        int n= matrix[0].length;
        int rowStart=0;
        int colStart=0;
        int rowEnd=m-1;
        int colEnd=n-1;
        ArrayList<Integer> result= new ArrayList<>();
        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i=colStart;i<=colEnd; i++){
                result.add(matrix[rowStart][i]);
            }
            for(int i=rowStart +1;i<=rowEnd;i++){
                result.add(matrix[i][colEnd]);
            }
            for(int i=colEnd-1; i>=colStart;i--){
                if(colStart==colEnd) break;
                result.add(matrix[rowEnd][i]);
            }
            for(int i=rowEnd-1;i>rowStart;i--){
                if(colStart==colEnd)break;
                result.add(matrix[i][colStart]);
            }
            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
        System.out.println(result);
    }
}
