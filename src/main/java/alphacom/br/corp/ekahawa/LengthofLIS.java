/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 */

import java.util.Arrays;
        
public class LengthofLIS 
{
    public int LengthofLisSol(int[] nums)
    {
        int[] tails = new int[nums.length];
        int len = 0; //Current length of the longest subsequence
        
        for(int num: nums)
        {
            //USe binary search to find the insertion point in the tails[0...len]
            int index = Arrays.binarySearch(tails, 0, len, num);
            
            //If the element is not found, binarySearch returns (-(insertion point) - 1)
            if(index < 0)
            {
                index = -(index + 1); //Convert to the correct insertionpoint
            }
            
        }
        return len;
    }
}
