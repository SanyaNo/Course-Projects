/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ex01;

import java.util.Arrays;


/**
 * @author SanyaNo
 */
public class Main {
    
    public static void main(String[] args) {
        
        int[] arr = Ex1_b.randArr(100, 15);
        System.out.println(Arrays.toString(arr));
        
        int sum = Ex1_b.sumPosOdd(arr);
        System.out.println("The sum of all odd positives is " + sum);
    }

}
