package A_PracticeCode;

public class anand6 {
        public static void main(String[] args) {
            int arr[] = {0,7,8,9,0,1,2,3,0,5,5,5,0,0};
            int j=0;
            int i=0;
            int a[]=new int[arr.length];
            for(i=0;i< arr.length;i++){
                if(arr[i]==0){
                    a[j++] =arr[i];
                }
            }
            i=0;
            while(i<arr.length){
                if(arr[i]!=0){
                    a[j++]=arr[i];
                }
                i++;
            }
            for(i=0; i< a.length ;i++){
                System.out.print(a[i]+ " ");
            }
        }

    public static class anand5 {

        public static void main(String[] args){
            LinkedList ll=new LinkedList();
            ll.addLast(20);
            ll.addLast(21);
            ll.addLast(10);
            ll.addLast(12);
            ll.addLast(15);
            ll.addLast(11);
            ll.addLast(14);
            ll.addLast(19);
            ll.print();
            int x=15;

            while(ll.head!=null && ll.head.data>x){
                if(ll.head.data>x){
                    ll.head=ll.head.next;
                }
            }
            if(ll.head==null){
                return;
            }
            if(ll.head.next==null){
                if(ll.head.data>x){
                    ll.head=null;
                }
                return;
            }
            Node temp=ll.head;
            Node pre=ll.head;
            while(temp.next!=null){
                if (temp.data > x ) {
                    temp.data = temp.next.data;
                    temp.next = temp.next.next;
                }
                else{
                    pre=temp;
                    temp=temp.next;
                }
            }
            if(temp!=null && temp.data>x){
                pre.next=null;
            }

            ll.print();

        }
    }
}
