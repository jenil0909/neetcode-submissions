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
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> res = new ArrayList<>();
        Deque <TreeNode> temp = new ArrayDeque<>();
        if (root == null ) return res;
        temp.add(root);
        while( !temp.isEmpty()){
            TreeNode bush = temp.pop();
            res.add(bush.val);
            if (bush.right != null) temp.push(bush.right);
            if (bush.left!=null) temp.push(bush.left);
            
        }

        return res;

    }
}