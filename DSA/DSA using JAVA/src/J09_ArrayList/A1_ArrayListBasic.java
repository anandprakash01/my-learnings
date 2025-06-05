package J09_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

// Collections is a class but Collection is an interface
public class A1_ArrayListBasic {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2,3);
        list.remove(2);
        System.out.println(list);
        list.set(1,10);//replaces
        System.out.println( list );
        System.out.println( list.contains(10) );
        System.out.println( list.size() );
        System.out.println(list.get(1));

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        swap(list,1,3);
        System.out.println(list);

        multiDimensionalArrayList();
    }
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        if(idx1>=list.size() || idx2>=list.size()){
            System.out.println("Index is out of Bound...!!!");
            return;
        }
        int x=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,x);
    }

    public static void multiDimensionalArrayList(){
        ArrayList<Integer> arrlist1=new ArrayList<>();
        ArrayList<Integer> arrlist2=new ArrayList<>();
        for(int i=1;i<=10;i=i+2){
            arrlist1.add(i);
            arrlist2.add(i+1);
        }
        ArrayList< ArrayList<Integer> > mainList=new ArrayList<>();
        mainList.add(arrlist1);
        mainList.add(arrlist2);
        System.out.println(mainList);
        //print using loop
        System.out.println("Printing Using loop ");
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> curr=mainList.get(i);
            for (Integer integer : curr) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }

}
