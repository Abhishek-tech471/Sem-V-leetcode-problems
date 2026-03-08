// Last updated: 08/03/2026, 08:12:36
1class Solution {
2    public int minimumIndex(int[] capacity, int itemSize) {
3        int ans =-1;
4        for(int i=0; i<capacity.length; i++){
5            if(capacity[i]>=itemSize){
6                if(ans ==-1){
7                    ans = i;
8                }
9                else if (capacity[i]<capacity[ans]){
10                    ans =i;
11                }
12            }
13        }
14        return ans;
15    }
16}