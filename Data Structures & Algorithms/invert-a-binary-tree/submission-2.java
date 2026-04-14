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
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        if(root==null)
          return null;

        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            TreeNode left=temp.left;
            temp.left=temp.right;
            temp.right=left;
             if(temp.right!=null)
               q.add(temp.right);  
            if(temp.left!=null)
               q.add(temp.left);
            
        }
        return root;

    
    }
}
