/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 */

/*
*
Time complexity O(N×M)
Space complexity O(N)

Problem:
Given an array coins represinting denominations of coins and an integer amount. The goal is to determine the least 
amount of coins needed to make the amount.
*/

import java.util.Arrays;

public class CoinChange 
{
    public int coinChangeSol(int[] coins, int amount)
    {
        //Step1 : Create a DP array initialized to maximum value
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); //Set all the values to a larger number
        dp[0] = 0; //Base case: 0 coins needed to make amount 0
        
        //Step 2: Build the DP table;
        for(int coin : coins) //Iterate for each coin denomination
        {
            for(int i = coin; i <= amount; i++ ) //Start from 'coint' to 'amount'
            {
                dp[i] = Math.min(dp[i], 1 + dp[i-coin]);
            }
        }
        //Step 3: Return the result
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
