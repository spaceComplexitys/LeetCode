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
 class BSTIterator {
    private final Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public TreeNode next() {
        TreeNode node = stack.pop();

        // Traversal cur node's right branch
        TreeNode cur = node.right;
        while (cur != null){
            stack.push(cur);
            cur = cur.left;
        }

        return node;
    }


}

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        BSTIterator bSTIterator = new BSTIterator(root);

        TreeNode emptyNode = new TreeNode();
        
        // while hasNExt is not false
        // bSTIterator.next() if the value is equal to value then return the node
        
        while (bSTIterator.hasNext()) {
            TreeNode cur = bSTIterator.next();
            if (cur.val == val) {
                return cur;
            }
        }
        
        return null;
    }
}