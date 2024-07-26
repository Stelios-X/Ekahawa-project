/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Leetcode 53

Given:

An integer array nums of arbitrary length.
Task:

Find the contiguous subarray (a subarray is a continuous part of an array) within the input array that has the largest sum.
Return the sum of this subarray.

Time Complexity: O(n), where n is the length of the input array.
Space Complexity: O(1), as we only use constant extra space.
*/


package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 */
public class MaxSubArray 
{
    public int maxSubArraySol(int[]  nums)
    {
        int n = nums.length;
        int currentSum = nums[0]; //Current sum of the subarray
        int maxSum = nums[0]; //Maximum sum encountered so far
        
        for(int i = 1; i<n; i++)    
        {
            //If the current sum is negative, it's better to start a new subarray
            if(currentSum < 0)
            {
                currentSum = nums[i];
            }
            else
            {
                //Otherwise add the current element to the current sum
                currentSum += nums[i];
            }
            //Update the maximum sum if necessary
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
