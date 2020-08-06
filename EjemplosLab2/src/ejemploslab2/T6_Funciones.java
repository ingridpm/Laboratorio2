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
public class T6_Funciones {

    public static void main(String[] args) {
        double perimetro = perimetro(5);
        System.out.println("El perimetro del circulo es " + perimetro);
    }

    final static double pi = 3.14159;

    public static double perimetro(int radio) {
        System.out.println("Entro a la funcion");
        double resultado = 2 * pi * radio;
        return resultado;
    }
}
