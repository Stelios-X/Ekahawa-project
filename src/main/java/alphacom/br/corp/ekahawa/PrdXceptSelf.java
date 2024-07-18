/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Time complexity: O(n), where n is the length of the input array. We iterate through the array twice.
Space complexity: O(1) extra space, as we only use constant extra space for variables.


*/
package alphacom.br.corp.ekahawa;

import java.util.Arrays;

/*
Leetcode 238

*/

/**
 *
 * @author brandon
 */
public class PrdXceptSelf 
{
    public int[] productExceptSelf(int[] nums)
    {
        int n = nums.length;
        int[] answer  = new int[n];//Use ans as the prefix product array
        
        //Initilize answer array with 1
        Arrays.fill(answer, 1);
        
        //Calculate left products products
        int leftProduct = 1;
        for(int i = 0; i < n; i++)
        {
            answer[i] *= leftProduct;
            leftProduct *= nums[i];
        }
        
        //Calculate the right product
        int rightProduct = 1;
        for(int i = n - 1; i > 0; i--)
        {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return answer;
    }
    
    
}
