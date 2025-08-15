// Last updated: 8/16/2025, 12:06:10 AM
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ll = new ArrayList<>();
        result(root1,ll);
        result(root2,ll);
        Collections.sort(ll);
        return ll;

        
    }
    public void result(TreeNode root, List<Integer> ll){
        if(root==null){
            return;
        }
        result(root.left,ll);
        ll.add(root.val);
        result(root.right,ll);
    }
}