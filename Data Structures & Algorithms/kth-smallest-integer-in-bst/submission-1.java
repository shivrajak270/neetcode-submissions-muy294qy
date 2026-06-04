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
        List<Integer>ans=new ArrayList<>();
    public void doit(TreeNode root){
        if(root == null)
           return;
       
        doit(root.left);
        ans.add(root.val);
        doit(root.right);
    
    }


    public int kthSmallest(TreeNode root, int k) {
        doit(root);
        return ans.get(k-1);

        
    }
}
