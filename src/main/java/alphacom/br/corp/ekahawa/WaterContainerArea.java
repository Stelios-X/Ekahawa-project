/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 * Leetcode 11. Container With Most Water
 * This problem aims to determine the two lines in a graph that can hold the most amount of water possible. Given an array of integers representing the heights of the container
 * 
 * Time Complexity - O(n) where n is the number of lines. We only traverse the array once with the 2 pointers
 * Space Complexity - O(1) since we are using a consistent amount of extra space.
 *
 * @author brandon
 */
public class WaterContainerArea 
{
public int WaterContainerAreaSol(int[] height)
    {
        //Initialize the 2 pointers, one on the left  and the other on the right 
        int left = 0;
        int right = height.length - 1;
        //Variable to stote the maximum area found
        int maxArea = 0;
        
        //Loop until the two pointers meet
        while(left < right)
        {
            //Calculate the are with the current left and right pointers
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            //Update the maxArea if the current area is larger
            maxArea = Math.max(maxArea, currentArea);
            
            //Move the pointer pointing to the shorter line inward, hoping to find a taller line
            if(height[left] < height[right])
            {
                left++;   //Move the left pointer to the right 
            }
            else
            {
                right--; //Move the right pointer to the left 
            }
        }
        
        //Return the maximum area found.
        return maxArea;
    }    
}
