/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Leetcode 338. Counting Bits
This problem requires you  to calculate the number of 1's(bits set to 1) in the binary representation of every number from 0 to a given integer n, 
and then return them as an array. 
Time complexity O(n) since we process each number from to 0 to n exactly once
Space complexity O(n) because we use an array of size n+1 to store the results 


*/

package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 */
public class CountingBits
{
    public int[] countBits(int n)
    {
        //Initialize the results array with size n+1
        int[] ans = new int[n+1];
        
        //Itearate through each number from 1 to n
        for(int i = 1; i<= n; i++)
        {
            //If the number is even use tye value of ans[i >> 1]
            //If the number is odd, use the value of ans[i >> 1] and add 1
            ans[i] = ans[i >> 1] + (i & 1);
        }
        //Return the result array
        return ans;
    } 
    
}
