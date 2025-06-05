package J16_BinaryTree;

public class SubTreeOfAnotherTree {
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
    // Given the roots of two binary trees, root and subroot, return true if there is a subtree of root with
    // same structure and same node value of subroot and return false otherwise

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
        /*                          2
                                  /   \
                                 4     5
         */
        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
        System.out.println(isSubtree(root,subroot));
    }

    public static boolean isIdentical(Node node,Node subroot){
        if(node==null && subroot==null){
            return true;
        }

        if(node==null || subroot==null || node.data!=subroot.data){ //non-Identical
            return false;
        }
        if(!isIdentical(node.left,subroot.left)){ //non-Identical
            return false;
        }
        if(!isIdentical(node.right,subroot.right)){ //non-Identical
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root, Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        return isSubtree(root.left,subroot) || isSubtree(root.right,subroot);
    }
}
