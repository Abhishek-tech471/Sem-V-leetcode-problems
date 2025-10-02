// Last updated: 10/2/2025, 11:38:37 PM
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty=0;
        int bottleDrunk=0;
        while(numBottles!=0 || numExchange<=empty){
            if(numBottles>0){
                empty+=numBottles;
                bottleDrunk+=numBottles;
                numBottles=0;
            }
            else if(numExchange<=empty){
                empty-=numExchange;
                numBottles++;
                numExchange++;
            }
        }
        return bottleDrunk;

    }
}