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

      Queue<TreeNode> q = new LinkedList<>();
      if(root!=null)
      q.offer(root);
      else{
        return root;
      }

      while(!q.isEmpty()){
        TreeNode temp=q.poll();
        TreeNode left=temp.left;
        TreeNode right=temp.right;
             if(temp.left!=null)
              q.offer(temp.left);
             if( temp.right!=null)
             q.offer(temp.right);
         
          temp.left=right;
          temp.right=left;
    
        
         
        }
      
      return root;

        
    }
}
