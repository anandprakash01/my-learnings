package J06_Recursion;

public class R4_DuplicateStr {

    //non-static method
    public void duplicateRemovedstr(String str,int idx,String newStr, boolean[] map){
        char currchar = str.charAt(idx);
        if(idx == str.length()-1){
            System.out.print(newStr);
            return;
        }
        if(map[currchar-'a'] == true){
            duplicateRemovedstr(str,idx+1,newStr,map);
        }
        else{
            map[currchar-'a']=true;
            duplicateRemovedstr(str,idx+1,newStr+currchar,map);
        }
    }
    public static void main(String[] args) {
        String str = "anandprakash";
        boolean map[] = new boolean[26];

        //for calling a non-Static method we have to call it by creating an object
        R4_DuplicateStr obj = new R4_DuplicateStr();
        obj.duplicateRemovedstr(str, 0, "", map);//andprks
    }
}
