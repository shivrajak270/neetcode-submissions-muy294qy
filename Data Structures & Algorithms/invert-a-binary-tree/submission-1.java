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

    
    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode>gh=new Stack<>();
        if(root==null)
          return null;
        gh.push(root);
        while(!gh.empty()){
            TreeNode temp=gh.pop();
            TreeNode templeft=temp.left;
            temp.left=temp.right;
            temp.right=templeft;

            if(temp.left!=null)
               gh.push(temp.left);

            if(temp.right!=null)
               gh.push(temp.right);   

        }
        return root;

        
    
    }
}
