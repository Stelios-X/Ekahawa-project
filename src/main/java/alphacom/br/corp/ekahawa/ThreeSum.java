/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;
import java.util.*;

/**
 *
 * Leetcode 15 ThreeSum
 * The algorithm finds all unique triplets in an array that sum up to zero. The objective is to identify all sets of three numbers (triplets) in the given array that add up to zero. 
 * Each triplet should be unique, meaning no duplicate triplets are allowed in the result. 
 * 
 * Time Complexity - O(n^2)
 * Space Complexity - O(1)
 * @author brandon
 */
public class ThreeSum 
{
    public List<List<Integer>> threeSumSolution(int[] nums )
    {
        //Result list to hold the triplets
        List<List<Integer>> result = new ArrayList<>();
        
        //Sort the array to make it easier to avoid duplicates and use two pointers
        Arrays.sort(nums);
        
        //Iterate through the array, considering each number as a potential first element of a triplet
        for(int i = 0; i < nums.length - 2; i++)
        {
            //Skip the same elements to avoid duplicate triplets
            if(i > 0 && nums[i] == nums[i -1] ) continue; 
            
            //Define two pointers, one starting just after 'i' and the other at the end of the array
            int left = i + 1;
            int right = nums.length - 1;
            
            //While the left pointer is less than the right pointer, look for triplets
            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum == 0)
                {
                    //Found a triplet that sums to zero
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    //Move the left pointer to the right, skipping duplicates
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    left++;
                    
                    //Move the right pointer to the left, skipping duplicates
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    right--;
                    
                }
                else if(sum < 0)
                {
                     //If the sum is less than zero, move the left pointer to the right
                     left++;
                }
                else
                {
                    //If the sum is greater than zero, move the right pointer to the left to decrease the sum
                    right--;
                }
            }
        }
        return result;
    }
}
