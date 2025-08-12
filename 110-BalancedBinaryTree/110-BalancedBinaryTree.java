// Last updated: 8/12/2025, 5:40:23 PM
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
    public boolean isBalanced(TreeNode root) {
           answer=0;
            result(root);
            
            if(answer==0){
               return true; 
            }
            else{
                return false;
            }
    }
    static int answer =0;
    public int result(TreeNode node){
            if(node==null){
                return -1;
            }
            int a = result(node.left);
            int b = result(node.right);
            if(a>b){
                int z= a-b;
                if(z>1){
                    answer=1;
                }
            }
            else{
                int z= b-a;
                if(z>1){
                    answer=1;
                }
            }
            return Math.max(a,b)+1;
        }
}