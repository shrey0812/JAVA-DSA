package tree;

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
}
