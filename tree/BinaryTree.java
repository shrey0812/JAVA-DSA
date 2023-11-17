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
            System.out.print(temp.data);
            if (temp.right!=null) {
                stack.push(temp.right);
            }
            if (temp.left!=null) {
                stack.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        // bt.preOrderRecursive(bt.root);
    }
}
