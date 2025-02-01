/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 */
public class CoinChange 
{
    public int coinChangeSol()
    {
        //Step1 : Create a DP array initialized to maximum value
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); //Set all the values to a larger number
        dp[0] = 0; //Base case: 0 coins needed to make amount 0
        
        //Step 2: Build the DP table;
    }
}
