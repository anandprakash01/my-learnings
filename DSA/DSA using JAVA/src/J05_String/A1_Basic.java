package J05_String;
import java.util.*;
public class A1_Basic {
    public static void main(String[] args){
        //char a[]={'2','f'};
        String str="Anand";
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int len=s1.length();
        System.out.println(s1);
        //------>concatenation/appending
        String s2=str+" "+s1;
        System.out.println(s2);
        str.charAt(0);
        str.equals(s1);

        Palindrome();
        compare();
        substring("anandprakash21@gmail.com",0,5);
        StringCompression();
    }

    public static void compare(){
        String s1="anand";
        String s2="prakash";
        s1.compareTo(s2);
        //if it is 0 then strings are equal
        // <0 than s1<s2
        // >0 then s1>s2
        System.out.println(s1.compareTo(s2));
        String s3[]={"Anand","Prakash","hr"};
        String largest=s3[0];
        for(int i=0;i<s3.length;i++){
            if(largest.compareTo(s3[i])<0){
                largest=s3[i];
            }
        }
        System.out.println(largest);
    }

    public static void Palindrome(){
        String s1="aantnaa";        //A and a both are different
        for(int i=0;i<s1.length()/2;i++){
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)){
                System.out.println("This is not palindrome");
                return;
            }
        }
        System.out.println("This is palindrome");
    }

    public static void substring(String str,int s,int e){
        String substr="";
        for(int i=s;i<e;i++){
            substr+=str.charAt(i);
        }
        System.out.println(substr);
        //inbuilt fun
        //System.out.println(str.substring(0,5));
    }
    public static void StringCompression(){
        String s1="aaaiiiiijjjjjoccciwalll";
        String s2="";
        for(int i=0;i<s1.length();i++){
            Integer count=1;
            s2+=s1.charAt(i);
            while(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                s2+=count.toString();       //String.valueOf(i) it converts direct int to string
            }
        }
        System.out.println(s2);
        return;
    }
}
