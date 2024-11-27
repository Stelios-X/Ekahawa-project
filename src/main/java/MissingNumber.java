/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brandon
 */
public class MissingNumber 
{
    public int[] missingNumber(int nums)
    {
        int n = nums.length;
        //Calculate the sum of the first n natural numbers
        int totalSum = n *(n+1)/2;
        
        //Calculate the sum of numbers present in the array
        int arraySum = 0;
        for(int num : nums)
        {
            arraySum += num;
        }
        
        //The missing number is the difference between the expected and the actual sum
        return totalSum - arraySum;
    }
    
}
