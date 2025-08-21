// Last updated: 8/21/2025, 10:14:13 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        long ct=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                c+=ct;
                ct++;
            }
            else{
                ct=1;
            }
        }
        return c;
    }
}