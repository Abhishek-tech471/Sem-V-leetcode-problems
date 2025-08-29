// Last updated: 8/30/2025, 1:03:12 AM
class Solution {
    public int minimumArea(int[][] grid) {
        int j=0;
        int h=0;
        int w=0;
        int b =0;
        int st =Integer.MAX_VALUE;
        int en = 0;
        while(j<grid.length){
            int a =0;
            int c=0;

            for(int i=0; i<grid[0].length; i++){
                if(grid[j][i]==1 && a>0){
                    c++;
                    a+=c;
                    c=0;
                    en = Math.max(i,en);

                }
                else if(grid[j][i]==1){
                    st = Math.min(st,i);
                    en = Math.max(i,en);
                    a++;
                }
                else if(a>0){
                    c++;
                }
                

            }
            // System.out.println(a);
            if(h>0 && a>0){
                b++;
                h+=b;
                b=0;
            }
            else if (a>0){
                h++;
            }
            else if(h>0){
                b++;
            }

            


            w = Math.max(w,a);

        j++;
        }

        System.out.println(st+ " "+ en);
        
        
        return (en-st+1)*h;
        
    }
}