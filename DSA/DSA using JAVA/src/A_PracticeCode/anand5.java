package A_PracticeCode;

class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next=null;
    }
}
class LinkedList{

     Node head;  //coz it should not be accessed by user i.e. in main fun
    static Node tail;
    public static int size;

    void addLast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=tail.next;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public int getSize(){
        if(head==null){
            return 0;
        }
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}
