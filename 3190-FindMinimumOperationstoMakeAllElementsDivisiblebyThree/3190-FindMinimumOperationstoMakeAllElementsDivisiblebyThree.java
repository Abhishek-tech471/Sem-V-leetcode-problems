// Last updated: 11/22/2025, 3:29:33 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]%3!=0){
                c++;
            }
        }
        return c;
    }
}