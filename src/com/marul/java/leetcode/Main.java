package com.marul.java.leetcode;

import com.marul.java.leetcode.treenode.TreeNode;

public class Main {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(3);
        treeNode1.right = new TreeNode(2);

        TreeNode treeNode2 = new TreeNode(2);
        treeNode2.left = new TreeNode(1);
        treeNode2.right = new TreeNode(3);
        treeNode2.left.right = new TreeNode(4);

        Main main = new Main();
        TreeNode result = main.merge(treeNode1, treeNode2);

        System.out.println(result.val);
        System.out.println(result.left.val);
        System.out.println(result.right.val);
        System.out.println(result.left.right.val);

    }

    public TreeNode merge(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;

        t1.val += t2.val;

        t1.left = merge(t1.left, t2.left);
        t1.right = merge(t1.right, t2.right);

        return t1;
    }
}
