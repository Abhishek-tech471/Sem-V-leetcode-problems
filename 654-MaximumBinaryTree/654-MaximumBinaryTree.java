// Last updated: 8/10/2025, 1:58:11 PM
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = new TreeNode();
        root =tree(nums, 0, nums.length);
        return root;
    }
    public TreeNode tree(int[]nums, int si , int ei){
        if(ei-si==0){
            return null;
        }
        int max = max(nums, si, ei);
        TreeNode root = new TreeNode(nums[max]);
        root.left =tree(nums,si,max);
        root.right =tree(nums,max+1,ei);
        return root;


    }

    public int max(int [] nums, int si, int ei){
        int max = si;
        for(int i=si; i<ei; i++){
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        return max;
    }
}