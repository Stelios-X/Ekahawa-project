/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *Leetcode 371. Sum of Two Integers
 * Given two integers a & b, return the sum of two integers without using the + n - operator.
 * @author brandon
 */
public class SumofIntegers 
{
    public int getSum(int a, int b)
    {
        //Loop until there is no carry
        while(b != 0)
        {
            //Carry now contains common set bits of a and b
            int carry = a & b;
            
            //Sum of bits of a and b where at least one of the bits is not set
            a = a ^ b;
            
            //Carry is shifted by one so that adding to it gives the required sum
            b = carry  << 1;
        }
        return a;
    }
}
