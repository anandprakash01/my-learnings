package J16_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        // build a preOrder tree from array
        public Node buildTree(int Nodes[]){
            idx++;
            if(Nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(Nodes[idx]);
            newNode.left=buildTree(Nodes);
            newNode.right=buildTree(Nodes);
            return newNode;
        }
    }

    public static void main(String[] args){
        int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(Nodes);
        System.out.println(root.data);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println("Height of tree is: "+Height(root));
        System.out.println("total no of Nodes of tree is: "+countNodes(root));
        System.out.println("total Sum of Nodes of tree is: "+Sum(root));
    }

    //preOrder Traversal
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
    //InOrder Traversal
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    //postOrder Traversal
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    //Level Order traversal
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode!=null){
                System.out.print(currNode.data+ " ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
            else{   //currNode==null
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
        }
    }

//    height of a tree. // in terms of nodes
//    (if in terms of edges -1 from (nodes term) )
    public static int Height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=Height(root.left);
        int rightHeight=Height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    //count of nodes
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int lc=countNodes(root.left); // total no of left subtree nodes
        int rc=countNodes(root.right);// total no of right subtree nodes
        return lc+rc+1;
    }
    // Sum of Nodes
    public static int Sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=Sum(root.left);
        int rightSum=Sum(root.right);
        return leftSum+rightSum+root.data;
    }
}
