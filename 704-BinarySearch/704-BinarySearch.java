// Last updated: 22/07/2026, 09:18:17
1class Solution {
2    public int search(int[] nums, int target) {
3        return binary(nums,target,0,nums.length-1,0);
4    }
5    public static int binary(int [] nums, int t, int mid , int high, int low){
6        mid=(low+high)/2;
7        if(nums[mid]==t){
8            return mid;
9        }
10        if(low>high){
11            return -1;
12        }
13        if(nums[mid]>t){
14            mid = binary(nums,t,mid,mid-1,low);
15        }
16        else if(nums[mid]<t){
17            mid =binary(nums,t,mid,high,mid+1);
18        }
19        return mid;
20
21    }
22}