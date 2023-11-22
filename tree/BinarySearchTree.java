package tree;

import java.util.Scanner;

public class BinarySearchTree {
    public TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }
    }

    public void insertRecursive(int value){
        root= insertRecursive(root,value);
    }


    public TreeNode insertRecursive(TreeNode root, int value){
        if(root==null){
            root= new TreeNode(value);
            return root;
        }
        if (value<root.data) {
            root.left=insertRecursive(root.left, value);
        }
        else{
            root.right=insertRecursive(root.right, value);
        }
        return root;
    }

    public void inOrder(){
        inOrder(root);
    }


    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public TreeNode search(TreeNode root,int value){
        if(root==null||root.data==value){
            return root;
        }
        if(root.data>value){
            return search(root.left, value);
        }
        else{
            return search(root.right, value);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bs = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the tree");
        int n = sc.nextInt();
        int value;
        System.out.println("Enter the value of nodes");
        for (int i = 0; i < n; i++) {
            value = sc.nextInt();
            bs.insertRecursive(value);
        }
        bs.inOrder();
        sc.close();
    }
}
