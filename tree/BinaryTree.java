package tree;

import java.util.Stack;

public class BinaryTree {
    

    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        } 
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left= second;
        first.right=third;

        second.left=fourth;
        second.right=fifth;
    }


    public void preOrderRecursive(TreeNode root){
        if (root==null) {
            return;
        }

        System.out.print(root.data+" ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }


    public void preOrderIterative(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if (temp.right!=null) {
                stack.push(temp.right);
            }
            if (temp.left!=null) {
                stack.push(temp.left);
            }
        }
    }


    public void inOrderRecursive(TreeNode root){
        if(root==null){
            return;
        }
        inOrderRecursive(root.left);
        System.out.print(root.data+" ");
        inOrderRecursive(root.right);
    }


    public void inOrderIterative(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stackIs = new Stack<>();
        TreeNode temporary = root;
        while (!stackIs.isEmpty() || temporary!=null) {
            if(temporary!=null){
                stackIs.push(temporary);
                temporary=temporary.left;
            }
            else  {
                temporary=stackIs.pop();
                System.out.print(temporary.data+" ");
                temporary=temporary.right;
            }
        }
    }

    public void postOrderRecursive(TreeNode root){
        if(root==null){
            return;
        }
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        // bt.preOrderRecursive(bt.root);
    }
}
