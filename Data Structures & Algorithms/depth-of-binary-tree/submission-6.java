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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode>hj=new LinkedList<>();
        if(root!=null){
            hj.add(root);
        }
        int count=0;
        while(!hj.isEmpty()){
                 int n=hj.size();
             for(int i=0;i<n;i++){
            TreeNode temp=hj.poll();
            if(temp.left!=null)
            hj.add(temp.left);
            if(temp.right!=null)
            hj.add(temp.right);
             }
             count++;
        }
        return count;
        
    }
}
