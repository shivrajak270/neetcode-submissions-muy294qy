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

public class Codec {

    public int index=0;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        StringBuffer sb=new StringBuffer();
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp==null){
                sb.append("N,");
                continue;
            }
            sb.append(temp.val).append(",");
            q.offer(temp.left);
            q.offer(temp.right);
            
        }
        return sb.toString();
           
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");

        if (arr[0].equals("N"))
            return null;

            TreeNode root = new TreeNode(Integer.parseInt(arr[0]));

            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);

            int i = 1;

            while (!q.isEmpty()) {

                TreeNode parent = q.poll();
                if(!arr[i].equals("N")){
                    TreeNode node=new TreeNode(Integer.parseInt(arr[i]));
                   parent.left=node;
                   q.offer(node);

                }
                i++;
                if(!arr[i].equals("N")){
                    TreeNode node=new TreeNode(Integer.parseInt(arr[i]));
                   parent.right=node;
                   q.offer(node);
                }
                i++;
            }

            return root;



    }
}
