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

    public TreeNode rt(TreeNode hh){
        if(hh==null)
           return hh;
        TreeNode temp=hh.left;
        hh.left=hh.right;
        hh.right=temp;

            rt(hh.left);
            rt(hh.right);

        return hh;

    }
    public TreeNode invertTree(TreeNode root) {
        
        return rt(root);
    }
}
