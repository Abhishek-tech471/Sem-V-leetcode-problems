// Last updated: 9/12/2025, 1:03:43 AM
class Solution {
    public int numberOfMatches(int n) {

        int matchesCount = 0;
        int teams = n;

        while(teams > 1){

            if(teams % 2 ==0){
                matchesCount += teams/2;
                teams = teams/2;
            }else{
                matchesCount += (teams-1)/2;
                teams = (teams-1)/2 + 1;
            }
        }
        return matchesCount;
    }
}