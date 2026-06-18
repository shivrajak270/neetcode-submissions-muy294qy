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
 */

class Solution {
    public int depth(TreeNode root,int depths){

        if(root==null)
          return depths;

        int left=depth(root.left,depths+1);
        int right=depth(root.right,depths+1);
        return Math.max(left,right);  

    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return depth(root,0);
    }
}
