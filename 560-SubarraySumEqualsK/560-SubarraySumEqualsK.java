// Last updated: 10/26/2025, 9:48:56 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
         int count=0;
       for(int j=0;j<nums.length;j++) {
			int sum=0;
		    for(int i=j;i<nums.length;i++) {
				sum+=nums[i];
				if(k==sum) {
					count++;
                    

				}
                
			}
            sum=0;
			
		} 
        return count;
    }
}