package chapter.six;

/*
 * Given an array of stock prices for given hours in a day,
 * calculate the maximum profit for that day.
 *
 * Ex: [300, 315, 275, 250, 250, 230, 240, 290, 305, 220, 250]
 *
 *  Res: Buy at 230, sell at 290
 */
public class SixDotSeven {

    private SixDotSeven() {}

    public static int findMaxProfit(int[] prices){

        int currLowest = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < currLowest){
                currLowest = prices[i];
            }
            int currProfit = prices[i] - currLowest;
            maxProfit = Math.max(maxProfit, currProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args){
        int[] testArray1 = new int[]{310, 315, 275, 295, 260, 270, 290, 230, 255, 250};

        System.out.println(SixDotSeven.findMaxProfit(testArray1));
    }

}
