/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 */



/*
Leetcode 191. Number of 1 Bits
This problem attempts to count the number of 1s representing the equivalent binary an unsigned interger e.g. the binary equivalent of 9 is 1001, meaning that it has 2 1s. 
The Time Complexity O(k), where k is the number of 1 bits in the number. 
Space complexity is O(1), a constant amount of space is used regardless of the size of input

*/
public class BitCount 
{
    //Function to count the number of 1 bits in the binary representation of the binary number
    public int BitCountSol(int n)
    {
        int count = 0; //Initialize the count of 1 bits
        
        //Continue until n becomes 0
        while(n != 0)
        {
            n = n &(n-1); //Clear the lowest set bit (1)
            count++; //Increment the count each time a bit is cleared
        }
        return count; //Return the total count of 1 bits
    }
}
