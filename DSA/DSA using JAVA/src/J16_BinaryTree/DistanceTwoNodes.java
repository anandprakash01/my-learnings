package J16_BinaryTree;

public class DistanceTwoNodes {
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
        int n1=4,n2=5;
        minD(root,n1,7);// min distance b/w roots

    }

    //distance b/w nodes
    public static int distance(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int left=distance(root.left,n);
        int right=distance(root.right,n);
        if(left==-1 && right==-1){
            return -1;
        }else if(left==-1){
            return right+1;
        }else{
            return left+1;
        }
    }

    //min distance b/w 2 nodes
    public static void minD(Node root,int n1,int n2){
        Node lca=lca(root,n1,n2);
        int n1dist=distance(lca,n1);
        int n2dist=distance(lca,n2);
        int mindistance=n1dist+n2dist;
        System.out.println(mindistance);
    }
    public static Node lca(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node left=lca(root.left,n1,n2);
        Node right=lca(root.right,n1,n2);
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        return root;
    }

}
