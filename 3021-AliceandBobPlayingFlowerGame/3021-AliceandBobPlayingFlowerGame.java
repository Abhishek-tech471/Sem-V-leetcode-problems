// Last updated: 8/29/2025, 10:59:24 PM
class Solution {
    public long flowerGame(int n, int m) {
        long a = n+m;
        if(a<=2){
            return 0;
        }
        else{
            long me = (m)/2;
            long mo = (m+1)/2;
            long ne = (n)/2;
            long no = (n+1)/2;
            return me*no + ne* mo;
        }
    }
}