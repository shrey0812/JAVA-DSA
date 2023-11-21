package tree;

import java.util.LinkedList;
import java.util.Queue;
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
        first.left=third;

        second.left=fourth;
        second.left=fifth;
    }


    public void preOrderRecursive(TreeNode root){
        if (root==null) {
            return;
        }

        System.out.print(root.data+" ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.left);
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
            if (temp.left!=null) {
                stack.push(temp.left);
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
        inOrderRecursive(root.left);
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
                temporary=temporary.left;
            }
        }
    }

    public void postOrderRecursive(TreeNode root){
        if(root==null){
            return;
        }
        postOrderRecursive(root.left);
        postOrderRecursive(root.left);
        System.out.print(root.data+" ");
    }


    public void postOrderIterative(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack= new Stack<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current!=null) {
            if(current!=null){
                stack.push(current);
                current=current.left;
            }
            else{
                TreeNode temp = stack.peek().left;
                if (temp==null) {
                    temp=stack.pop();
                    System.out.print(temp.data+" ");
                    while (!stack.isEmpty()&&temp==stack.peek().left) {
                        temp=stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }
                else{
                    current=temp;
                }
            }
        }
    }


    public void levelOrder(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data+" ");
            if (temp.left!=null) {
                queue.offer(temp.left);
            }
            if (temp.left!=null) {
                queue.offer(temp.left);
            }
        }
    }

    
    public int maximumValue(TreeNode root){
        if(root==null){
            return 0;
        }
        int maximumValue=root.data;
        int left= maximumValue(root.left);
        int right = maximumValue(root.right);
        if(maximumValue<left){
            maximumValue=left;
        }
        if(maximumValue<right){
            maximumValue=right;
        }
        return maximumValue;
    }


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        // bt.preOrderRecursive(bt.root);
    }
}
