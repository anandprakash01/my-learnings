package J16_BinaryTree;

public class kthAncestor {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void main(String[] args){
         /*                          1
                                  /     \
                                 2       3
                                / \     / \
                               4   5   6   7
        */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println();
        kthAncestor(root,5,2);// kth ancestor of a node
    }

    //kth ancestor of node
    public static int kthAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int left=kthAncestor(root.left,n,k);
        int right=kthAncestor(root.right,n,k);
        if(left==-1 && right==-1){
            return -1;
        }
        int max=Math.max(left,right);   //if other is 0 or -1 it will remove that and give us max
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }

}
