package ejemploslab2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ingri
 */
public class TT10_Excepciones {

    public static void main(String[] args) {
        /*
        try {
            int[] notas = new int[5];
            notas[0] = 93;//siempre se inicia en cero
            notas[1] = 41;
            notas[2] = 56/0;
            notas[3] = 63;
            notas[4] = 64;
            notas[5] = 5;
        } catch (ArrayIndexOutOfBoundsException excepcion) {
            System.out.println("Indice fuera de los límites: " + excepcion.getMessage());
        }
        */
        
        try {
            int[] notas = new int[5];
            notas[0] = 93;//siempre se inicia en cero
            notas[1] = 41/0;
            notas[2] = 56;
            notas[3] = 63;
            notas[4] = 64;
            notas[5] = 5;
        } catch (Exception e) {
            System.out.println("La excepción: " + e);
        }
        
        
    }
}
