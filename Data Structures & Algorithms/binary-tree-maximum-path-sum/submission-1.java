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

    private int bestpath=Integer.MIN_VALUE;
    int thesum(TreeNode root){
        int sum=0;
        if(root==null)
          return 0;  

        int left = thesum(root.left);
        int right = thesum(root.right);

    left=Math.max(left,0);
    right=Math.max(right,0);
    sum=Math.max(left,right)+root.val;
    bestpath=Math.max(bestpath,root.val+left+right);
    return sum;
}
    public int maxPathSum(TreeNode root) {
        
        thesum(root);
        return bestpath;
    }
}
