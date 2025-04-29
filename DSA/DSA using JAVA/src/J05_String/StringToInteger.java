package J05_String;

public class StringToInteger {
//    Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
//
//    The algorithm for myAtoi(string s) is as follows:
//    Whitespace: Ignore any leading whitespace (" ").
//    Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
//    Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of
//    the string is reached. If no digits were read, then the result is 0.
//    Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to
//    remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers
//    greater than 231 - 1 should be rounded to 231 - 1.

    public static void main(String[] args){
        String s ="  ";

        // Step 1: Ignore leading whitespaces
        s = s.trim();
//        while(s.charAt(index)==' '){
//            index++;
//        }
        if (s.isEmpty()){
            System.out.println("NA");
            return;
        }

        // Step 2: Determine the sign
        boolean isPositive = true;
        int index = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            if(s.charAt(0)=='-'){
                isPositive=false;
            }
            index++;
        }
        // Step 3: Convert digits to integer
        long result=0;
        while(index < s.length() && Character.isDigit(s.charAt(index))){
            result = result * 10 + s.charAt(index)-'0';
            if(result>Integer.MAX_VALUE) break;
            index++;
        }

        // Step 4: Apply sign and handle 32-bit integer bounds
        if(!isPositive) result *= -1;

        if(result<Integer.MIN_VALUE){
            result=Integer.MIN_VALUE;
            System.out.println(result);
        }
        else if(result>Integer.MAX_VALUE){
            System.out.println(result);
        }

    }
}
