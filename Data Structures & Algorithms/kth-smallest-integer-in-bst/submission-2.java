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
        int count=0;
        int ansi=-1;
    public void doit(TreeNode root,int k){
        if(root == null)
           return;
        doit(root.left,k);
        count++;
        if(count==k){
            ansi=root.val;
            return;
        }
        doit(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        doit(root,k);
        return ansi;
    }
}
