/*
https://leetcode.com/problems/binary-tree-paths/submissions/

 */
public class BinaryTreePaths {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     *
     * Your input  [1,2,3,null,5]
     * Output  ["1->2->5","1->3"]
     */
  /*  class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> ans = new ArrayList<>();
            helper(root, "", ans);
            return ans;
        }

        public void helper(TreeNode root,String ans, List<String> al){
            if(root == null) return;
            if(root.left == null && root.right == null){
                ans+= root.val;
                al.add(ans);
                return;
            }
            helper(root.left, ans + root.val + "->", al);
            helper(root.right, ans + root.val + "->", al);
        }*/
    }