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
    

    public boolean putarray(TreeNode root,
                        TreeNode target,
                        List<TreeNode> path) {

    if(root == null)
        return false;

    path.add(root);

   if(root.val == target.val)
    return true;

    if(putarray(root.left, target, path) ||
       putarray(root.right, target, path))
        return true;

    path.remove(path.size() - 1);

    return false;
}
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
          List<TreeNode>parray=new ArrayList<>();
         List<TreeNode>qarray=new ArrayList<>();

      
         putarray(root,p,parray);
          putarray(root,q,qarray);

          TreeNode ans=null;
          int n=Math.min(parray.size(),qarray.size());

          for(int i=0;i<n;i++){
            if(parray.get(i)==qarray.get(i))
                ans=parray.get(i);
            else
               break;    
          }
          return ans;



        
    }
}
