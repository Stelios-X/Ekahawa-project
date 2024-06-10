/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package alphacom.br.corp.ekahawa;

/**
 *
 * @author brandon
 */
public class Ekahawa {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int[] nums = {7,1,5,3,6,4};
        //int target = 6;
        
        //Vuyanzi vuyanzi = new Vuyanzi();
        //System.out.println(Arrays.toString(vuyanzi.twoSumSolution(nums, target)));
        
        StockBuySell stocks = new StockBuySell();
        System.out.println(stocks.maxProfit(nums));
    }
}
