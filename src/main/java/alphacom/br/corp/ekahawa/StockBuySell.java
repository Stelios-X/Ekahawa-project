/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 */
public class StockBuySell 
{
    public int maxProfit(int prices[])
    {
        //Initialize minPrice to the maximum possible integer value
        int minPrice = Integer.MAX_VALUE;
        
        //Initialize maxProfit to 0
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++ )
        {
            //If the current price is less than the minimum price seen so far, update the minPrice to current price
            if(prices[i] < minPrice)
            {
                minPrice = prices[i];
                //If the difference between the current price and minPrice is greater than the maximum profit seen so far, update maxProfit
            }
            else if(prices[i] - minPrice > maxProfit)
            {
                maxProfit = prices[i] - minPrice;
            }
            
        }
        //return maximum profit
        return maxProfit;
    }    
}
