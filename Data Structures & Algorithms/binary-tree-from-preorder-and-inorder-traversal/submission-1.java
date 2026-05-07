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
    int taken=0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer>indexes=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            indexes.put(inorder[i],i);
        }
        return helper(preorder,indexes,0,inorder.length-1);
    }
    public TreeNode helper(int [] preorder,Map<Integer,Integer>index,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root=new TreeNode();
        root.val=preorder[taken];
        int where=index.get(preorder[taken]);
        taken++;
        root.left=helper(preorder,index,start,where-1);
        root.right=helper(preorder,index,where+1,end);
        return root;
    }
}
