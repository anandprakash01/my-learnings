package J09_ArrayList;

import java.util.ArrayList;

public class A5_ContainerWithMostWater {
    /* for given n lines on x-axis, use 2 lines to form a container such that it holds maxWater,
    width is same(i.e. 1) between the lines; */
    private static void container(ArrayList<Integer> height){
        int l=0;
        int r=height.size()-1;
        int lidx=0;//to store index which are forming container
        int ridx=r;
        int maxWater=0;
        while(l<r){
            int waterlevel=Math.min(height.get(l),height.get(r));
            int currWater= waterlevel* (r-l);
            if(currWater>maxWater){
                maxWater=currWater;
                lidx=l;
                ridx=r;
            }
            if(height.get(l)<height.get(r)){
                l++;
            }else{
                r--;
            }
        }
        System.out.println("Index of the container is: "+lidx+" and "+ ridx+", max Water is : " +maxWater);
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        container(height);
    }

}
