// Last updated: 8/27/2025, 10:03:26 PM
class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        int last =nums[hi];
        int ans =0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if (nums[mid]<=last){
                ans =nums[mid];
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
}