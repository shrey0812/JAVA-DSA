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

    
    public boolean search(int key){
        root= search(root, key);
        if(root==null)return false;
        else return true;
    }

    public TreeNode search(TreeNode root,int key){
        if(root==null||root.data==key){
            return root;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    public boolean isValidBTS(TreeNode root){
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        return isValidBTS(root,min,max);
    }

    public boolean isValidBTS(TreeNode root, long min, long max){
        if(root==null){
            return true;
        }
        if(root.data<=min||root.data>=max){
            return false;
        }
        boolean left = isValidBTS(root, min, root.data);
        if(left){
            boolean right = isValidBTS(root, root.data, max);
            return right;
        }
        return false;
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

        // System.out.println("Node to be searched");
        // int key = sc.nextInt();
        // System.out.println(bs.search(key));
        sc.close();
    }
}
