class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        
//  prices = [7,1,5,3,6,4]  
        
//              sell            buy 
//              today           yesterday
//         i    prices[i]       prices[i-1]     profit
//         1    1           <   7               0       //Don't sell
//         2    5           >   1               4
//         3    3           <   5               4       //Don't sell
//         4    6           >   3               7
//         5    4           <   6               7       //Don't sell
        for(int i=1; i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}
