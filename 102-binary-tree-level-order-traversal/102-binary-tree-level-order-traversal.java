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

class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder (TreeNode root) {
		// return value
		List<List<Integer>> list = new ArrayList<>();
		// error checking
		if (root == null) return list;

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> currLevel = new ArrayList<>();
			while (size-- > 0) {
				TreeNode curr = q.poll();
				currLevel.add(curr.val);
				if(curr.left != null) q.offer(curr.left);
				if(curr.right != null) q.offer(curr.right);
			}
			list.add(currLevel);
		}
		return list;
	}
}
