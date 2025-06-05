package J16_BinaryTree;

import java.util.ArrayList;

public class LowestCommonAncestor {
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

        //lca (Lowest common Ancestor
        int n1=5,n2=4;
        System.out.println("\n"+lca(root,n1,n2).data);
        System.out.println(lca2(root,n1,n2).data);
    }
    //lowest common ancestor of 2 nodes n1 and n2;
    public static boolean getpath(Node root, int n, ArrayList<Node> path){// for getting path from root to n
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean left=getpath(root.left,n,path);
        boolean right=getpath(root.right,n,path);
        if(left || right){
            return true;
        }
        path.remove(path.size()-1);

        return false;
    }

    // Approach 1 ==> TC O(n) and space complexity O(n)
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();//coz we have to return Node type lca
        ArrayList<Node> path2=new ArrayList<>();
        getpath(root,n1,path1);
        getpath(root,n2,path2);
        //last common ancestor
        int i=0;
        for(;i< path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        Node lca =path1.get(i-1);
        return lca;
    }
    //Approach 2 for Lowest common Ancestor ==>  TC O(n) and Space O(1)
    public static Node lca2(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node left=lca2(root.left,n1,n2);
        Node right=lca2(root.right,n1,n2);
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        return root; //if both are valid
    }
}
