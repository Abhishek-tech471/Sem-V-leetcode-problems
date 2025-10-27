// Last updated: 10/27/2025, 8:05:53 PM
class Solution {
    public long[] findPrefixScore(int[] nums) {
        int max=nums[0];
        long [] prefix = new long [nums.length];
        prefix[0]=2*nums[0];
        for(int i=1; i< nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            prefix[i]=prefix[i-1]+nums[i]+max;
        }
        return prefix;
    }
}