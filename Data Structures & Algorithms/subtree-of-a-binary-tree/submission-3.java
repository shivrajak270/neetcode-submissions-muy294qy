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

   public String preorder(TreeNode root){

    StringBuffer sb=new StringBuffer();
             if(root==null)
               return null;

            sb.append(root.val);
            sb.append(preorder(root.left));
            sb.append(preorder(root.right));

            return sb.toString();

   }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if(preorder(root).contains(preorder(subRoot))){
        return true;
      }
      return false;
    }
}
