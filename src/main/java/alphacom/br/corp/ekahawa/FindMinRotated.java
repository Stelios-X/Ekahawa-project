/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 * 
 * This problem involves finding the minimum element in  an array that has been sorted in ascending order and then rotated at some pivot. The array lacks duplicates.
 * Time Complexity - O(log n), as we halve the search space in each step.
 * Space Complexity - O(1), as we only use a constant amount of extra space 
 * 
 * 
 */
public class FindMinRotated 
{
    public int findMin(int[] nums)
    {
        //Initialize the left  and right pointers
        int left = 0;
        int right = nums.length - 1;
        
        //Binary search loop
        while(left<right)
        {
            //Calculate the mid index
            int mid = left + (right - left) / 2;
            
            //Check if the mid element is greater than  the rightmost element
            if(nums[mid] > nums[right])
            {
                //If mid element is greater, then the minimum is in the right half
                left = mid + 1;
            }
            else
            {
                //Otherwise, the minimum is in the left half including mid
                right = mid;
            }
        }
        //After the loop, left and right converge to the minimum element
        return nums[left];
    }
}
