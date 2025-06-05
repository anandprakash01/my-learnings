package J05_String;

import java.util.Deque;
import java.util.LinkedList;

public class S5_ReverseWords {
//    Given a string s, reverse the string without reversing its individual words. Words are separated by spaces.
//    Input: s = " i like this   program    very much "
//    Output: "much very program this like i"
    public static String sol1(String s){
        s=s.trim();
        String[] words= s.split("\\s+");
        StringBuilder result=new StringBuilder("");
        for(int i=words.length-1;i>=0; i--){
            result.append(words[i]);
            if(i>0){
                result.append(" ");
            }
        }
//        return result.toString();
        Deque<String> deque = new LinkedList<>();
        for(String word : words) {
            deque.addFirst(word);
        }
        return String.join(" ", deque);
    }

    public static String sol2(String s){
        StringBuilder result=new StringBuilder("");
        StringBuilder currWord=new StringBuilder("");
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            while(i>=0 && s.charAt(i) != ' '){
                currWord.append(s.charAt(i));
                i--;
            }
            if(!currWord.isEmpty()){
                result.append(currWord.reverse()).append(" ");
                currWord.setLength(0);
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args){
        String s = " i like this   program very   much  ";
        System.out.println(sol1(s));
        System.out.println(sol2(s));
    }
}
