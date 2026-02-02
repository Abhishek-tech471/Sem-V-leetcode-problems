// Last updated: 2/2/2026, 1:45:42 PM
1class Solution {
2    public int minSideJumps(int[] obstacles) {
3        int  n = obstacles.length;
4        int [][] dp = new int [4][n+1];
5        return jump(obstacles,n,2,0,dp);
6
7    }
8    public static int jump(int [] obstacles, int n, int pos, int i,int [][] dp){
9        if(i==n-1){
10            return 0;
11        }
12        
13        if(obstacles[i]==pos){
14            return Integer.MAX_VALUE;
15        }
16        if(dp[pos][i]!=0){
17            return dp[pos][i];
18        }
19        int jumpc=0;
20        if(obstacles[i+1]==pos){
21            if(pos==1){
22                jumpc=Math.min(jump(obstacles,n, pos+1, i,dp),jump(obstacles,n, pos+2, i,dp))+1;
23            }
24            else if(pos==2){
25                jumpc=Math.min(jump(obstacles,n, pos-1, i,dp),jump(obstacles,n, pos+1, i,dp))+1;
26            }
27            else{
28                jumpc=Math.min(jump(obstacles,n, pos-2, i,dp),jump(obstacles,n, pos-1, i,dp))+1;
29            }
30        }
31        else{
32            jumpc=jump(obstacles,n, pos, i+1,dp);
33        }
34        return dp[pos][i]=jumpc;
35    }
36        
37}