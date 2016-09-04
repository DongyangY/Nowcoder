/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	if (pre.length == 0) return null;
	return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int pstart, int pend, int[] in, int istart, int iend) {

	TreeNode parent = new TreeNode(pre[pstart]);

	// locate the parent in inorder sequence
	int i = istart;
	for (; i <= iend; i++) {
	    if (in[i] == parent.val) {
		break;
	    }
	}

	// size of left subtree and right subtree
	int nleft = i - istart, nright = iend - i;

	if (nleft > 0) {
	    parent.left = reConstructBinaryTree(pre, pstart + 1, pstart + nleft, in, istart, i - 1);
	}

	if (nright > 0) {
	    parent.right = reConstructBinaryTree(pre, pstart + nleft + 1, pstart + nleft + nright, in, i + 1, iend);
	}

	return parent;
    }
}
