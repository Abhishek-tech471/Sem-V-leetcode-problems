// Last updated: 25/09/2026, 14:18:13
1import java.util.Arrays;
2
3class Solution {
4    public int coinChange(int[] coins, int amount) {
5        int [] dp = new int [amount + 1];
6        Arrays.fill(dp, -2);
7        int a = ans(coins, amount, amount, dp);
8        
9        // If 'a' is still your invalid high value, return -1
10        return a > amount ? -1 : a;
11    }
12    
13    public int ans(int [] coins, int amount, int sum, int [] dp){
14        if (sum == 0) {
15            return 0;
16        }
17        
18        if (sum < 0) {
19            return amount + 1; // High value representing "impossible"
20        }
21        
22        if (dp[sum] != -2) {
23            return dp[sum];
24        }
25        
26        int a = amount + 1; // Initialize to our "impossible" boundary marker
27        
28        for (int i = 0; i < coins.length; i++) {
29            int b = ans(coins, amount, sum - coins[i], dp);
30            
31            // Only consider it if 'b' itself didn't hit an impossible state
32            if (b <= amount) {
33                a = Math.min(a, b + 1); // Add 1 coin here
34            }
35        }
36        
37        // Simply store and return 'a'. The +1 was already handled inside the loop.
38        return dp[sum] = a;
39    }
40}
41