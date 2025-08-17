// Last updated: 8/18/2025, 12:30:31 AM
class Solution {
    public int minSteps(String s, String t) {
        int [] arr1 = new int [26];
        int arr2 [] = new int [26];
        for(int i=0; i<s.length(); i++){
            int a = s.charAt(i)-'a';
            arr1[a]++;
        }
        for(int i=0; i<t.length(); i++){
            int a = t.charAt(i)-'a';
            arr2[a]++;
        }

        int pc=0;
        for(int i=0; i<26; i++){
            if(arr1[i]>arr2[i]){
                pc+=arr1[i]-arr2[i];
            }
        }
        return pc;
    }
}