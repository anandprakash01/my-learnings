package A_PracticeCode;

public class anand8 {
    static public Node moveZeroes(Node head)

    {

// Your code here

        if(head.next==null)

            return head;

        Node prev=head,curr=head.next,next=head;

        while(curr!=null){

            if(curr.data == 0){

                next=curr.next;

                curr.next=head;

                prev.next=next;

                head=curr;

                curr=next;

            }else{

                next=curr.next;

                prev=curr;

                curr=next;

            }

        }

//head=prev;

        return head;

    }
}
