// Last updated: 1/21/2026, 12:11:07 PM
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int a = XOR(arr1);
4        int b =XOR(arr2);
5        return a & b;
6        
7    }
8    public static int XOR(int []arr){
9        int xor=0;
10        for(int v:arr){
11            xor^=v;
12        }
13        return xor;
14    }
15}