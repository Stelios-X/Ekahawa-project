/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 */
public class MissingNumber 
{
    public int missingNumberSol(int[] nums)
    {
        int n = nums.length;
        //Calculatthe sum of the first n natural numbers
        int totalSum = n * (n+1)/2;
        
        //Calculate the sum of numbers present in the array
        int arraySum = 0;
        for(int num: nums)
        {
            arraySum += num;
        }
        
        return totalSum - arraySum;
    }
    
}
