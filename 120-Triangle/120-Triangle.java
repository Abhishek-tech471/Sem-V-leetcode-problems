// Last updated: 9/26/2025, 8:57:28 PM
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int [][] dp = new int [triangle.size()][triangle.get(triangle.size()-1).size()];

        for( int [] a : dp){
            Arrays.fill(a,-66666);
        }
        return result(triangle, 0,0,  dp );
    }

    public static int result(List<List<Integer>> triangle, int i, int j, int [][] dp){
        if (j == triangle.size()){
            return 0;
        }
        if(dp[i][j]!=-66666){
            return dp[i][j];
        }
        int left = result(triangle, i, j+1,dp);
        int right = result(triangle, i+1, j+1,dp);


        return dp[i][j]=Math.min(left,right)+ triangle.get(j).get(i);
    }
}