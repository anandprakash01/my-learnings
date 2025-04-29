package J05_String;

import java.util.ArrayList;
import java.util.List;

public class PhoneLetterCombination {
//    Given a string containing digits from 2-9 inclusive, return all possible
//    letter combinations that the number could represent. Return the answer in any order.
//    Input: digits = "23"
//    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
//    Input: digits = "2"
//    Output: ["a","b","c"]
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };
    public static void main(String[] args){
        String digits="23";
        List<String> result=new ArrayList<>();
        if(digits.isEmpty()){
            System.out.println(digits);
        }
      backtrack(result,new StringBuilder(),digits,0);

        System.out.println(result);
    }
    private static void backtrack(List<String> result,StringBuilder combination,String digits, int index){
        if(index==digits.length()){
            result.add(combination.toString());
            return;
        }
        String letters=KEYPAD[digits.charAt(index)-'0'];
        for(char letter:letters.toCharArray()){
            combination.append(letter);
            backtrack(result,combination,digits,index+1);
            combination.deleteCharAt(combination.length()-1);
        }
    }
}
