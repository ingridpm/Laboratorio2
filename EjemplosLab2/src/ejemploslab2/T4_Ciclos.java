/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploslab2;

/**
 *
 * @author ingri
 */
public class T4_Ciclos {
    public static void main(String[] args){
       /*
//While
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        */
        /*
        //do while
        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
        */
        
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        */
        
        /*
        System.out.println("Break en for");
        int i = 5;
        for (i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        */
        /*
        System.out.println("\nContinue en for");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        */
        /*
        //En el while
        System.out.println("\nBreak en while");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
*/
        System.out.println("\nContinue en while");
        int j = 0;
        while (j < 10) {
            if (j == 4) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }
}
