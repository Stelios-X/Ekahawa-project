/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package alphacom.br.corp.ekahawa;

import java.util.Arrays;

/**
 *
 * @author brandon
 */
public class Ekahawa {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int[] nums = {3,5,7,4,8,2};
        int target = 6;
        
        Vuyanzi vuyanzi = new Vuyanzi();
        System.out.println(Arrays.toString(vuyanzi.twoSumSolution(nums, target)));
    }
}
