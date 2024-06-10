/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
*The solution has a time complexity of O(n) where n is the number of elements in the array. this is due to the fact that we only iterae through the array once.
Each time we perform 2 ops, checking for the complement and adding the element to the array
The space complexity is O(n),this is because in the worst-case scenario, we will add all the elements in the array to the map. This means that the map could 
potentially have n entries corresponding with the array length. Each of which calls for a constant amount of space.
*/
package alphacom.br.corp.ekahawa;
import java.util.HashMap;

/**
 *
 * @author brandon
 */
public class Vuyanzi 
{
    public int[] twoSumSolution(int[] nums, int target)
    {
        //Create the Hashmap to store the array
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //Iterate through the array and search for the target while adding the array elements to the HashMap
        for (int i = 0; i < nums.length; i++)
        {
            //Calculate the complement of the current number
            int complement = target -nums[i];
            
            //If the complement is available in the map, return both the current index and its index as well
            if(map.containsKey(complement))
            {
                return new int[] {map.get(complement) ,i};
            }
            //If the complement is not found, add the current element and it's index to the map
            map.put(nums[i], i);
        }
        //If no two numbers sum up to the target, throw an exception
        throw new IllegalArgumentException("No two sum solution found");
    }
    
}
