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

   public boolean identical(TreeNode one,TreeNode two){
        if(one!=null && two!=null){
            if(one.val!=two.val){
               return false;
            }
        }
          if(one==null && two ==null)
            return true;
        if(one==null  || two ==null)
             return false;
      
        
        return identical(one.left,two.left)&& identical(one.right,two.right);
    }
    public TreeNode getroot(TreeNode one,TreeNode two){
        if(one!=null && two!=null){
            if(one.val==two.val){
               return one;
            }
        }
         if(one==null  || two==null)
             return null;

         TreeNode left= getroot(one.left,two);
         TreeNode right=getroot(one.right,two);    

         return (left!=null)?left:right;
    }

    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
         if(root==null)
          return false;

        if(identical(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}
