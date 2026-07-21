// Last updated: 21/07/2026, 13:37:17
1class Solution {
2    public boolean checkEqualPartitions(int[] nums, long target) {
3        long sum =1;
4        for(int i=0; i<nums.length; i++){
5            sum*=nums[i];
6        }
7        if(sum==target*target){
8            return result(nums,1,0,target);
9        }
10        else{
11            return false;
12        }
13        
14    }
15    public static boolean result(int [] nums, long pro, int idx, long target){
16        if(pro==target){
17            return true;
18        }
19        if(pro>target){
20            return false;
21        }
22        boolean ans =false;
23        for(int i=idx; i<nums.length; i++){
24            boolean a=result(nums, pro*nums[i], i+1, target);
25            if(a){
26                ans=true;
27            }
28        }
29        return ans;
30
31    }
32}