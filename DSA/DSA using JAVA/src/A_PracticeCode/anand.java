package A_PracticeCode;
import java.util.*;
public class anand {
    //Mock hard level 1
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        LinkedHashMap<Integer,Integer> myMap=new LinkedHashMap<>();

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(myMap.containsKey(a[i])){
                myMap.put(a[i],myMap.get(a[i])+1);
            } else{
                myMap.put(a[i],1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:myMap.entrySet()){
            System.out.print(entry.getKey()+" ");
            list.add(entry.getKey());
        }
        System.out.println();
        int mid=list.size()/2;
        System.out.println(list.get(mid));
        list.remove(mid);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                secondmax=max;
                max=list.get(i);
            }else if(list.get(i)>secondmax && list.get(i)<max){
                secondmax=list.get(i);
            }
        }
//        for(int i=0;i<b.length;i++){
//            System.out.print(b[i]+" ");
//        }
        System.out.println(secondmax);
    }
}
