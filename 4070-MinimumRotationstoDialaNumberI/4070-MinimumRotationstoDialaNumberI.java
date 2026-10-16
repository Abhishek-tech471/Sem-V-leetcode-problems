// Last updated: 16/10/2026, 19:46:06
1class Solution {
2    public int minRotations(String s) {
3        char st = '0';
4        int count=0;
5        for(int i=0; i<s.length();i++){
6            int a=s.charAt(i)-'0';
7            int b = st-'0';
8            int clock=0;
9            int anti=0;
10            if(a<b){
11                 clock=b-a;
12                 anti=10-b+a;
13            }
14            else{
15                 clock=a-b;
16                 anti=10-a+b;
17            }
18            
19            count+=Math.min(clock,anti);
20            st=s.charAt(i);
21        }
22        return count;
23    }
24}