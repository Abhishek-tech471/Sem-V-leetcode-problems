// Last updated: 11/23/2025, 8:13:04 AM
class Solution {
    public long sumAndMultiply(int n) {
        int a=0;
        int c=1;
        int d=0;
        while(n>0){
            int b=n%10;
            d+=b;
            if(b!=0){
                a=b*c+a;
                c*=10;
            }
            n=n/10;
            
        }


        return (long)a*d;

        
        
        
    }
}