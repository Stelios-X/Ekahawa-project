/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 * 
 * This problem requires you to find the contiguous subarray within the provided one-dimensional array of integers that has the largest product. Leetcode 152. Maximum Product Subarray
 * Time complexity is O(n), where n is the length of the input array, because we only traverse the array once
 * Space complexity is O(1) as we are using a constant amount of extra space 
 * 
 * 
 */
public class MaxProduct 
{
    public int maxProductSol(int[] nums)
    {
        //Edge case, if the arrau is empty return 0
        if(nums ==  null || nums.length == 0)
        {
            return 0;
        }
        
        //Initialize maxProduct, minProduct and result with the first element of the array
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        
        //Iterate through the array starting from the second element
        for(int i = 1; i < nums.length; i++)
        {
            //If the current number is negative, swap the maxProduct and minProduct
            if(nums[i] < 0)
            {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            
            //Update maxProduct and minProduct
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct* nums[i]);
            
            //Update the result with the maximum product found so far
            result = Math.max(result, maxProduct);
        }
        
        //Return the result, which is the maximum product subarray
        return result;
    }
    
}
