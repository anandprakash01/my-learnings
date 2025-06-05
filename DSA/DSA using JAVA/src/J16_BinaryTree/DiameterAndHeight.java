package J16_BinaryTree;

public class DiameterAndHeight {
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
    // for calculating diameter in O(n)
    static class info{
        int ht;//height;
        int diam; // diameter;
        public info(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }

    public static void main(String[] args){
        /*                           1
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
        System.out.println("height of tree is: "+height(root));
        System.out.println("Diameter of the tree is:" +diameter2(root));
        System.out.println("Diameter of the tree is:" +diameter(root).diam);
        System.out.println("Height of tree is:" +diameter(root).ht);
    }

    public static info diameter(Node root){ // O(n)
        if(root==null){
            return new info(0,0);
        }
        info leftinfo=diameter(root.left);
        info rightinfo=diameter(root.right);
        int finaldiam=Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht+rightinfo.ht+1);
        int finalht=Math.max(leftinfo.ht,rightinfo.ht)+1;
        return new info(finalht,finaldiam);
    }

    static int diameter2(Node root){     //O(n^2)
        if(root==null){
            return 0;
        }
        int leftD=diameter2(root.left);
        int rightD=diameter2(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int selfD=lh+rh+1;      // when passes through that node too
        return Math.max(leftD,Math.max(rightD,selfD));
    }

    static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }

}
