// Last updated: 8/23/2025, 7:21:53 PM
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
    public int kthSmallest(TreeNode root, int k) {
        a=k;
        result(root,k);

        return num;
    }
    int num=0;
    int a =0;
    public void result(TreeNode root, int k){
        if(root == null){
            return ;
        }
        

        result(root.left,k);
        if(a>0 && root.val>=num){
            num=root.val;
            a--;
        }
        result(root.right,k);

        return ;
        
    }
    
}