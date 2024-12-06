/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *
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
