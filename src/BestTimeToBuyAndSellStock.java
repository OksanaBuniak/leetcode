public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[min]) {
                min = i;
            }
            if (prices[i] - prices[min] > profit && i > min) {
                profit = prices[i] - prices[min];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] input = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(input));
        int[] input1 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(input1));
    }
}
