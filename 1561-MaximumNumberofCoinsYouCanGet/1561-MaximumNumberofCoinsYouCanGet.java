// Last updated: 9/19/2025, 11:41:05 PM
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum=0;
        int a = piles.length/3;
        for(int i=a; i<piles.length;i+=2){
            sum+=piles[i];
        }
        return sum;
    }
}