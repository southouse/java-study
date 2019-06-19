package com.marul.java.leetcode.treenode;

/**
 * @author iffybot
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTwoBinaryTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;

        t1.val += t2.val;

        t1.left = mergeTwoBinaryTrees(t1.left, t2.left);
        t1.right = mergeTwoBinaryTrees(t1.right, t2.right);

        return t1;
    }
}
