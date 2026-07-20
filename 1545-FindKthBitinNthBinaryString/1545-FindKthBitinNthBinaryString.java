// Last updated: 20/07/2026, 09:33:07
1class Solution {
2    public char findKthBit(int n, int k) {
3        String s="0";
4        for(int i=0; i<n-1; i++){
5            if(s.length()>=k){
6                break;
7            }
8            s=str(s);
9        }
10        // char ans='';
11        System.out.println(s);
12        
13        return s.charAt(k-1);
14        
15    }
16    public static String str( String s){
17        // String t="";
18        StringBuilder t= new StringBuilder();
19        for(int i=s.length()-1; i>=0;i--){
20            if(s.charAt(i)=='0'){
21                t.append('1');
22            }
23            else{
24                t.append('0');
25            }
26        }
27        return s+"1"+t.toString();
28    }
29}