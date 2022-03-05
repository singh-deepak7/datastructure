public class TreeTrv {
}

/**
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
 * Definition for a binary tree node. */

class TreeNode {
     int val;
   TreeNode left;
   TreeNode right;
   TreeNode() {}
    TreeNode(int val) { this.val = val; }
   TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
       this.left = left;
        this.right = right;
    }
 }

class Solution {
    public TreeNode helper(int[] arr, int lr, int rr, int[] idx){
        int i = idx[0];
        if(i == arr.length || lr > arr[i] || arr[i] > rr) return null;
        TreeNode root  = new TreeNode(arr[i]);
        idx[0] ++;
        root.left = helper(arr, lr, root.val, idx);
        root.right = helper(arr, root.val, rr, idx);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE, new int[1]);

    }
}