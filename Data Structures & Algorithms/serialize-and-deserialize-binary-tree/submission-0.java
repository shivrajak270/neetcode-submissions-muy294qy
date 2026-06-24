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
    int idx = 0;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
          return "N,";

        StringBuffer sb=new StringBuffer();
        sb.append(root.val);
        sb.append(',');
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        return build(arr);
    }
    public TreeNode build(String[] arr){
        String curr=arr[idx];
        idx++;

         if(curr.equals("N"))
            return null;


        TreeNode node = new TreeNode(Integer.parseInt(curr));
            node.left = build(arr);
        node.right = build(arr);
        return node;
    }
}
