/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/


class Solution {

    Node clonemap(Node node,Map<Node,Node>mp){
        Node node1=new Node(node.val);
           mp.put(node,node1);
        for(Node neighbour:node.neighbors){
            if(!mp.containsKey(neighbour)){
               Node clonedNeighbour = clonemap(neighbour, mp);
                   node1.neighbors.add(clonedNeighbour);
            }
            else{
                node1.neighbors.add(mp.get(neighbour));
            }
        }
        return node1;
    }
    public Node cloneGraph(Node node) {
        if(node==null)
          return null;
          Map<Node,Node>mp=new HashMap<>();
          return clonemap(node,mp);    
    }
}