/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/*
Leetcode 217. Contains Duplicate
The Time Complexity O(n), the algorithm iterates through each element of the list exactly once and it's repeated relative to the number of elements(n). 
Addition to the set  are performed in consistent time (O(1)) due to Hashing
Space complexity is O(n), it grows linearly with the input list size

*/
package alphacom.br.corp.ekahawa;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author brandon
 */
public class ContainsDuplicate 
{
    public boolean containsDuplicate(int[] nums)
    {
        //Initilize a set to track observed elements
        Set<Integer> numsSet = new HashSet<>();
        
        for(int num: nums)
        {
            //Check if the element is already in the set (indicating a duplicate)
            if(numsSet.contains(num))
            {
                return true;
            }
            //Add the element to the set
            numsSet.add(num);
        }
        //If no duplicate is found return false
        return false;
    }
    
}
