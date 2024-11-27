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
Leetcode 268. Missing Number
The Time Complexity O(n), the algorithm requires one pass through the array to compute the sum so the time conplexity is linear 
Space complexity is O(1), no additional space is required that grows the input size; only a few variables are used

*/

public class MissingNumber 
{
    public int missingNumberSol(int[] nums)
    {
        int n = nums.length;
        //Calculatthe sum of the first n natural numbers
        int totalSum = n * (n+1)/2;
        
        //Calculate the sum of numbers present in the array
        int arraySum = 0;
        for(int num: nums)
        {
            arraySum += num;
        }
        
        return totalSum - arraySum;
    }
    
}
