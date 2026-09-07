// Last updated: 07/09/2026, 19:25:04
1class Solution {
2    public double myPow(double x, int n) {
3        long nn = n;
4
5        if (nn < 0)
6            nn = -nn;
7
8        double ans = power(x, nn);
9
10        if (n < 0)
11            return 1.0 / ans;
12
13        return ans;
14    }
15
16    private double power(double x, long n) {
17        if (n == 0)
18            return 1.0;
19
20        double half = power(x, n / 2);
21
22        if (n % 2 == 0)
23            return half * half;
24
25        return x * half * half;
26    }
27}
28