/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 * 
 * Leetcode number 70 Climbing stairs problem.
 * The problem focuses on the number of ways a flight of stairs can be climbed if one is taking either one step at a time or 2. 
 * 
 * Time complexity O(n)
 * Space complexityO(1) - Instead of maintaining an array to store all previous results, we only keep track of the last two computed values, which allows us to achieve this.
 * 
 */
public class ClimbingStairs 
{
    public int climbStairsSol(int n)
    {
        //Base cases
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        //Variables to store the previous 2 values
        int prev1 = 2; //Ways to reach step 2
        int prev2 = 1; //Ways to reach step 1
        int current = 0; //Placeholder for current calculation
        
        //Iterate from step 3 to n
        for(int i = 3; i <= n; i++)
        {
            current = prev1 + prev2; //Apply Fibonacci relation
            prev2 = prev1; //Shifts previous values
            prev1 = current; 
        }
        return current; //The final computed value
    }
    
}
