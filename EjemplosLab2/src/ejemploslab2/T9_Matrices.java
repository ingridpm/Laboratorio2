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
public class T9_Matrices {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6}};
        
        int[][] matriz2 = new int[2][3];
        matriz2[0][0] = 1;
        matriz2[0][1] = 2;
        matriz2[0][2] = 3;
        
        matriz2[1][0] = 4;
        matriz2[1][1] = 5;
        matriz2[1][2] = 6;
        
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                System.out.println("Posición " + i + "," + j + ": " +matriz[i][j]);
            }
        }
        /*
        System.out.println("\nMatriz 2");
        for(int i = 0; i<matriz2.length; i++){
            for(int j = 0; j<matriz2[0].length; j++){
                System.out.println("Posición " + i + "," + j + ": " +matriz2[i][j]);
            }
        }
*/
    }
}
