// Last updated: 9/2/2025, 11:31:05 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0; 
        for(int i=0; i< arr.length;i++){
            if(c==3){
                return true;
            }
            if(arr[i]%2!=0){
                c++;
            }
            else{
                c=0;
            }
            if(c==3){
                return true;
            }
        }
        if(c==3){
           return true;
        }
        return false;
    }
}