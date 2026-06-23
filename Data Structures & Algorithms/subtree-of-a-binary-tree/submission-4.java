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
  public String compare(TreeNode root){
    StringBuffer sb=new StringBuffer();
    if(root==null)
       return null;
    sb.append(root.val);
    sb.append(compare(root.left));
    sb.append(compare(root.right));
    return sb.toString();
  }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

      if(root==null && subRoot==null){
        return true;
      }
       if(root==null || subRoot==null){
        return false;
      }

      if(compare(root).contains(compare(subRoot))){
        return true;
      }
      return false;


    }
}
