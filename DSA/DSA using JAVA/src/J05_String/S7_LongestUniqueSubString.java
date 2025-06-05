package J05_String;

import java.util.Arrays;
//        Longest Unique characters Substring
//        string consists of English small letters only
public class S7_LongestUniqueSubString {
    public static void main(String[] args){
        String str="abcabcdefghijbbafeti";
        boolean[] fre=new boolean[26];
        int count=0;
        int maxcount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!fre[ch-'a']){
                count++;
            }
            else{
                Arrays.fill(fre,false);
                count=1;
            }
            fre[ch-'a']=true;
            maxcount=Math.max(maxcount,count);
        }
        System.out.println(maxcount);
    }
}
