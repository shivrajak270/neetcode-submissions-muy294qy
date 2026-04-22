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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode>gh=new LinkedList<>();
        List<List<Integer>>jkk=new ArrayList<>();
        if(root==null)
           return jkk;
        gh.add(root);
        while(!gh.isEmpty()){
            int size=gh.size();
            List<Integer>temp=new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode hj=gh.poll();
                if(hj.left!=null)
                    gh.add(hj.left);

                if(hj.right!=null)
                  gh.add(hj.right);    
                temp.add(hj.val);
            }
            jkk.add(temp);
        }
        return jkk;



        
    }
}
