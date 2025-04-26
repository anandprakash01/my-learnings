package A_PracticeCode;

public class anand4 {
    public static void main(String[] args){
        //remove duplicates from sorted arr
        int  a[]={10,5,11,2,11,4,2,3,3,4,4};
        int n=a.length;
        int b[]=new int[100];
        for(int i=0;i<n;i++){
            b[a[i]]++;
        }
        int j=0;
        for(int i=0;i<b.length;i++){
            if(b[i]>0){
                a[j++]=i;
            }
        }
        while(j<n){
            a[j++]=-1;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
