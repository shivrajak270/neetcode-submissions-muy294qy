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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode>queue1=new LinkedList<>();
         Queue<TreeNode>queue2=new LinkedList<>();

        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
            int k=0;



        queue1.add(p);
        queue2.add(q);         

        while(!queue1.isEmpty()&& !queue2.isEmpty()){
               TreeNode one=queue1.poll();
               TreeNode two=queue2.poll();
            if(one.val==two.val){
                if(one.left!=null && two.left!=null){
                    queue1.add(one.left);
                    queue2.add(two.left);

                }
                else if(one.left==null && two.left==null)
                       k=1;
                else{
                    return false;
                }
                if(one.right!=null && two.right!=null){
                    queue1.add(one.right);
                    queue2.add(two.right);
                }
                else if(one.right==null && two.right==null){
                    k=1;
                }
                else{
                    return false;
                }
                
            }
            else{
                return false;
            }
        }
        return true;
    }
}
