// Last updated: 8/11/2025, 9:57:04 PM
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
        List<Integer> ll = new ArrayList<>();
        Traverse(root,ll);
        return ll;
    }
    public void Traverse(TreeNode root, List<Integer> ll){
        if(root==null){
            return;
        }
        
        Traverse(root.left,ll);
        ll.add(root.val);
        Traverse(root.right,ll);
    }
}