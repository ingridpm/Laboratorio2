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
public class T3_EstructurasControl {

    public static void main(String[] args) {
        int n1 = 2, n2 = 2;
        /*        
        //IF
        if (n1 > n2) {
            System.out.println(n1 + " es mayor a " + n2);
        }
        */
        /*
        //IF ELSE 
        if (n1 > n2) {
            System.out.println(n1 + " es mayor a " + n2);
        } else {
            System.out.println(n1 + " es menor a " + n2);
        }
        */
        /*
        //IF ELSE IF
        if (n1 > n2) {
            System.out.println(n1 + " es mayor a " + n2);
        } else if (n1 == n2) {
            System.out.println(n1 + " es igual a " + n2);
        } else {
            System.out.println(n1 + " es menor a " + n2);
        }
        */
        //SWITCH
        
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese una opción, para los números " + n1 + " y " + n2);
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int opcion = lector.nextInt();
        
        /*
        if(opcion == 1){
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        } else if(opcion == 2){
            System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        } else if(opcion == 3){
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        } else if(opcion == 4){
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        } else {
            System.out.println("Opcion inválida");
        }
        
        */
        switch (opcion) {
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                break;
            default:
                System.out.println("Opción inálida");
        }
    }
}
