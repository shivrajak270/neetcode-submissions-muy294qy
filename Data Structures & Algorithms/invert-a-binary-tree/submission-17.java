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
      Queue<TreeNode>hj=new LinkedList<>();
      if(root==null)
          return root;

          hj.add(root);
          while(!hj.isEmpty()){
            TreeNode temp=hj.poll();
            TreeNode yu=temp.left;
            temp.left=temp.right;
            temp.right=yu;
            if(temp.left!=null)
            hj.add(temp.left);
            if(temp.right!=null)
            hj.add(temp.right);
            
            
          }
          return root;
        
    }
}
