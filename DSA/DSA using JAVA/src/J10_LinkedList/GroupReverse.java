package J10_LinkedList;

import java.util.LinkedList;

public class GroupReverse {
//    Given the head of a linked list, reverse the nodes of the list k at a time,
//    and return the modified list. k is a positive integer and is less than or equal
//    to the length of the linked list. If the number of nodes is not a multiple of k
//    then left-out nodes, in the end, should remain as it is.
//    Input: head = [1,2,3,4,5], k = 2

//    Output: [2,1,4,3,5]
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static void main(String[] args){
        Node head=new Node(1);
        int k=3;
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
//        head.next.next.next.next.next = new Node(6);

        Node dummy=new Node(0);
        dummy.next=head;

        Node preEnd=dummy;
        Node groupStart=head;
        while(true){
            Node kthNode = getKthNode(groupStart,k);
            if(kthNode==null){
                break;
            }
            Node nextGroupStart=kthNode.next;
            kthNode.next=null;

            Node reversedGroup= reverse(groupStart);

            // connect the reversed list;
            preEnd.next=reversedGroup;
            groupStart.next=nextGroupStart;

            //update the pointers
            preEnd=groupStart;
            groupStart=nextGroupStart;
        }

        dummy=dummy.next;
        while(dummy!=null){
            System.out.print(dummy.val+" -> ");
            dummy=dummy.next;
        }

    }

    private static Node getKthNode(Node node,int k) {
        while(node!=null && k>1){
            node=node.next;
            k--;
        }
        return node;
    }
    private static Node reverse(Node head){
        Node prev=null;
        Node current=head;
        while(current!=null){
            Node next=current.next;

            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

}
