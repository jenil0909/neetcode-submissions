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
    public List<Integer> inorderTraversal(TreeNode root) {
           List<Integer> ans = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            if (root == null) return ans;
            TreeNode node = root;

            while(!stack.isEmpty()  || node != null ){
                if (node!= null){
                    stack.push(node);
                    node=node.left;
                }
                else{
                    TreeNode temp = stack.pop();
                    ans.add(temp.val);
                    if(temp.right!=null)
                    node =temp.right;
                }
            }
            return ans;
    }
}