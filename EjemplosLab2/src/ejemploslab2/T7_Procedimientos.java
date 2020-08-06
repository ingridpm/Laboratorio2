/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploslab2;

import java.util.Scanner;

/**
 *
 * @author ingri
 */
public class T7_Procedimientos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        menu();
        int opcion = lector.nextInt();
        System.out.println("Seleccionó la opción: "+opcion);
    }

    public static void menu() {
        System.out.println("");
        System.out.println("Menu");
        System.out.println("Ingrese 1 para opcion 1");
        System.out.println("Ingrese 2 para opcion 2");
        System.out.println("Ingrese 3 para opcion 3");
        System.out.println("Ingrese 4 para opcion 4");
        System.out.println("Ingrese 5 para opcion 5");
        System.out.println("Ingrese 6 para opcion 6");
        System.out.println("Ingrese 7 para opcion 7");
        System.out.println("Ingrese 8 para opcion 8");
        System.out.println("");
    }
}
