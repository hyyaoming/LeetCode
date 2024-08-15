package LeetCode122;

public class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                int temp = prices[i] - prices[i - 1];
                sum += temp;
            }
        }
        return sum;
    }
}
