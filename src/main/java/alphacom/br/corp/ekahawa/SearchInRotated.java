/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 * 
 * 
 * Leetcode 33
 * 
 *Given a sorted array that has been rotate at an unknown pivot. Search for a target value in this rotated sorted array and return its index. If the target is not found, return -1.           
 *Time complexity is O(log n): The time complexity is logarithmic because we are effectively performing a binary search on the array.
 *Space complexity is O(1): The space complexity is constant since we are using a fixed amount of extra space regardless of the input size.
 * 
 * */


public class SearchInRotated 
{
    public int search(int [] nums, int target)
    {
        //Edge case: If array is empty
        if(nums == null || nums.length == 0)
        {
            return -1;
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right)
        {
            int mid = left +(right - left) / 2;
            
            //Check if mid is the target
            if(nums[mid] == target)
            {
                return mid;
            }
            
            //Determine which side is properly sorted
            if(nums[left] <= nums[mid])
            {
                //Left side is sorted
                if(nums[left] <= target && target <nums[mid])
                {
                    //Target is in the left side
                    right = mid - 1;
                }
                else
                {
                    //Target is in the right side
                    left = mid + 1;
                }
            }
            else
            {
                //Right side is sorted
                if(nums[mid] < target && target <= nums[right])
                {
                    //Target is in the right side
                    left = mid + 1;
                }
                else
                {
                    //Target is in the left side
                    right = mid - 1;
                }
            }
        }
        //Target not found
        return -1;
    }
}
