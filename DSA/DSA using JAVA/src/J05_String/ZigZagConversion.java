package J05_String;

public class ZigZagConversion {
//    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//    Rows=3;
//    P   A   H   N
//    A P L S I I G
//    Y   I   R
//    And then read line by line: "PAHNAPLSIIGYIR"
//    Rows=4;
//    P     I    N
//    A   L S  I G
//    Y A   H R
//    P     I
    public static void main(String[] args){
        String str="PAYPALISHIRING";
        int rows=3;
        System.out.println(convert(str,rows));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s; // No zigzag needed
        }

        StringBuilder[] rows =new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int currentRow=0;
        boolean isGoingDown=false;
        // for(int i=0;i<s.length();i++){
        for(char c: s.toCharArray()){
            // rows[currentRow].append( s.charAt(i) );
            rows[currentRow].append(c);
            if(currentRow == 0 || currentRow == numRows-1){
                isGoingDown = !isGoingDown;
            }
            currentRow+= isGoingDown ? 1: -1;
        }
        StringBuilder result=new StringBuilder();
        for(StringBuilder row:rows){
            result.append(row);
        }
        return result.toString();

    }
}
