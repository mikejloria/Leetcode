/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/


import java.util.List;
class NAryPreorderTraversal  {


    // iterative	
    public List<Integer> preorderIterative (Node root) {

    }
    


    // recursive
    public List<Integer> list = new ArrayList<>();	
    public List<Integer> preorderRecursive (Node root) {

	    if (root == null) return list;

	    list.add(root.val);
	    for (Node child : root.children)
		    predorderRecursive(child);

	    return list;
    }
}
