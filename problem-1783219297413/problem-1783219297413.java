// Last updated: 05/07/2026, 08:11:37
1class Solution {
2    public int maxDigitRange(int[] nums) {
3        int n = nums.length;
4        int max=0;
5        int sum=0;
6        for(int i=0; i<n; i++){
7            int dg = digit(nums[i]);
8            if(dg>max){
9                max=dg;
10                sum=nums[i];
11            }
12            else if(dg == max){
13                sum+=nums[i];
14            }
15        }
16        return sum;
17    }
18    public static int digit(int a){
19        int max = 0;
20        int min=100;
21        while(a>0){
22            int c= a%10;
23            if(c>max){
24                max=c;
25            }
26            if(c<min){
27                min=c;
28            }
29            a=a/10;
30            
31        }
32        return max-min;
33    }
34}