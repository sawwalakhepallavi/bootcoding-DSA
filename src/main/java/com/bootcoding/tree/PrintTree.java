package com.bootcoding.tree;

public class PrintTree {

    public TreeNode addTreeNode(){
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.right=new TreeNode(6);
        return root;
    }
    int max=0;
        public int inOrder(TreeNode root) {
            if (root == null) {
                return 0;
            }
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
            if (root.data > max) {
                max = root.data;
            }
            return max;
        }


    public static void main(String[] args) {
        PrintTree printTree=new PrintTree();
        TreeNode t=printTree.addTreeNode();
        System.out.println("maximum number of tree: "+printTree.inOrder(t));

    }
}
