class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];

        //initilize larger value
        for(int i=0; i<=amount; i++){
            dp[i]=amount+1;
        }
             dp[0]=0;

             //process each coin
        for(int coin:coins){
            for(int i=coin; i<=amount; i++){
                dp[i]=Math.min(dp[i],dp[i-coin]+1);
            }
        }
        //check conditionn
                if(dp[amount]>amount){
                    return -1;
                }
        return dp[amount];

    }
}