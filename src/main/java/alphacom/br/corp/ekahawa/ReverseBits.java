/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *Leetcode 190. Reverse Bits problem
 * The solution reverses the bits of a 32-bit unsigned integer.
 * Time complexity is O(1) The function processes exactly 32 bits so it has a constant time complexity
 * Space complexity is O(1) The function uses only a few integer values so the space complexity is constant. 
 * 
 * 
 * @author brandon
 */
public class ReverseBits 
{
    //Function to reverse the bits of a given 32-bit unsigned integer
    public int reverseBitSolution(int n)
    {
        //Initialize the result variable to store the reverse bits
        int result = 0;
        //Loop over all 32 bits
        for(int i = 0; i < 32; i++)
        {
            //Extract the least significant bit of 'n' and add it to the result
            result = (result << 1) | (n & 1);
            //Shift 'n' to the right by 1 bit to proces the next bit
            n = n >> 1;
        }
        return result; //The reverse bit is returned as the new result
    }
}
