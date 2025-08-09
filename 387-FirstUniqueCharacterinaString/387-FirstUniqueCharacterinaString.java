// Last updated: 8/9/2025, 11:26:09 PM
class Solution {
    public int firstUniqChar(String s) {
        for (int i=0; i<s.length(); i++){
            int a=0;
            for(int j=0; j<s.length(); j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    a=1;
                    break;
                }
            }
            if(a==0){
                return i;
            }
        }
        return -1;
    }
}