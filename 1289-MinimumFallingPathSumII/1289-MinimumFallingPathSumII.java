// Last updated: 9/10/2025, 12:42:27 PM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int dp [][] = new int [matrix.length][matrix[0].length];
        for(int []a: dp){
            Arrays.fill(a,-66666);
        }
        int ans = Integer.MAX_VALUE;
        for(int col=0; col<matrix[0].length; col++){
            ans = Math.min(ans,Minimum_Falling_Path(matrix,0,col,dp));
        }
        return ans;
    }
    public static int Minimum_Falling_Path(int [][] matrix , int cr, int cc, int [][]dp){

        // if(cc < 0 || cc >= matrix[0].length){
        //     return Integer.MAX_VALUE;
        // }
        if(cr == matrix.length - 1){
            return matrix[cr][cc];
        }

        if(dp[cr][cc]!=-66666){
            return dp[cr][cc];
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<matrix[0].length; i++){
            if(cc==i){
                continue;
            }
            ans = Math.min(ans,Minimum_Falling_Path(matrix,cr+1,i,dp));
        }
        // int ld = Minimum_Falling_Path(matrix,cr+1,cc-1,dp);
        // int rd = Minimum_Falling_Path(matrix,cr+1,cc+1,dp);
        // int d = Minimum_Falling_Path(matrix,cr+1,cc,dp);

        return  dp[cr][cc]=matrix[cr][cc]+ans;
    }
}