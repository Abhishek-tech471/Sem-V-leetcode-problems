// Last updated: 08/03/2026, 08:57:39
1class Solution {
2    public int smallestBalancedIndex(int[] nums) {
3        int n=nums.length;
4        int [] pre=new int [n];
5        int [] pro = new int [n];
6        pre[0]=nums[0];
7        if(nums.length<=1){
8            return -1;
9        }
10        if(nums.length==2){
11            if(nums[0]==1){
12                return 1;
13            }
14        }
15        for(int i=1; i<nums.length; i++){
16            pre[i]=nums[i]+pre[i-1];
17        }
18        pro[n-1]=nums[n-1];
19        for(int i=nums.length-2; i>=0; i--){
20            pro[i]=nums[i]*pro[i+1];
21        }
22
23        
24        
25        for(int i=1;i<nums.length-1;i++){
26            if(pre[i-1]==pro[i+1]){
27                return i;
28            }
29        }
30        return -1;
31        
32    }
33}