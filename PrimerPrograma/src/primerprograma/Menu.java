/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;

import java.util.Scanner;

/**
 *
 * @author ingri
 */
public class Menu {
    Scanner lector;
    int opcion;
    
    public Menu() {
        opcion = 0;
        lector = new Scanner(System.in);
        //menuPrincipal();
        System.out.println("Termino");
    }

    public void menuPrincipal() { 
        do{
            System.out.println("");
            System.out.println("Rombo");
            System.out.println("Ingrese 1 para mostrar el cuadrante superior izquierdo");
            System.out.println("Ingrese 2 para mostrar el cuadrante superior derecho");
            System.out.println("Ingrese 3 para mostrar el cuadrante inferior izquierdo");
            System.out.println("Ingrese 4 para mostrar el cuadrante inferior derecho");
            System.out.println("Ingrese 5 para la opcion el rombo completo");
            System.out.println("Ingrese 6 para salir");
            System.out.println("");
            
            opcion = lector.nextInt();
            
            switch(opcion){
                case 1:
                    cuadrante1();
                    break;
                case 2:
                    cuadrante2();
                    break;
                case 3:
                    cuadrante3();
                    break;
                case 4:
                    cuadrante4();
                    break;
                case 5:
                    rombo();
                    break;
                case 6:
                    System.out.println("Ha salido");
                    break;
            }        
        }while(opcion !=6);
    }
    
    private void cuadrante1() {
        System.out.println("Se imprime el primer cuadrante");
    }

    private void cuadrante2() {
        System.out.println("Se imprime el segundo cuadrante");
    }

    private void cuadrante3() {
        System.out.println("Se imprime el tercer cuadrante");
    }

    private void cuadrante4() {
        System.out.println("Se imprime el cuarto cuadrante");
    }

    private void rombo() {
        System.out.println("Se imprime el rombo");
    }
}
