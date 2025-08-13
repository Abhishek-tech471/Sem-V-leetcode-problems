// Last updated: 8/13/2025, 11:58:57 AM
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
    int move =0;
    public int distributeCoins(TreeNode root) {
        Coin(root);
        return move;
    }
    public int Coin(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = Coin(root.left);
        int right = Coin(root.right);
        int ans = root.val + left + right -1;
        move+=Math.abs(ans);
        return ans;
    }
}