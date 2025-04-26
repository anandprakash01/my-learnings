package A_PracticeCode;

public class anand2 {
    public static void main(String[] args){
        //given 2 sorted array, merge a and b array while maintaining the order
        //and fill all small elements first in first array and then in second arr. without using extra space
        int a[]={1,4,7,8,10};
        int b[]={2,3,9};
        int i=0;
        int j=0;
        while(i<a.length){
            if(a[i]>b[j]){
                int temp=a[i];
                a[i]=b[j];
                // insert temp at the right pos in second array
                while(j<b.length-1 && temp>b[j+1]){
                    b[j]=b[j+1];
                    j++;
                }
                b[j]=temp;
                i++;
                j=0;
            }
            else{
                i++;
            }
        }
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
