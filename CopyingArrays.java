/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingarrays;

import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class CopyingArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        
        for(int i=0; i<10; i++){
        
            int num = 1 + r.nextInt(10);
            int arr[] = new int[10];
            int copyArr[] = new int[10];
            arr[i] = num;
            
            System.arraycopy(arr, 0, copyArr, 0, arr.length);
            
            arr[9] = -7;
            System.out.println(arr[i] + "   " + copyArr[i]);
        }
        
    }
    
}
