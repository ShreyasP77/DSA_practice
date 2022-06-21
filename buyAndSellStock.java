import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
// Best Time to buy and Sell Stock
public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int curPrice = Integer.MAX_VALUE;
        int max_profit = 0;
        int len = prices.size();
        int profit = 0;
        for(int i = 0; i<len; i++){
            curPrice = Math.min(curPrice,prices.get(i));
            profit = prices.get(i) - curPrice;
            max_profit = Math.max(max_profit,profit);

        }
        return max_profit;
    }
}
