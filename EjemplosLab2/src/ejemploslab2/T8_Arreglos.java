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
public class T8_Arreglos {
    public static void main(String[] args) {
        /*
        String[] alumnos = {"Jose", "Jorge","Juan","Carlos"};
        System.out.println("Alumnos");
        System.out.println(alumnos[0]);
        System.out.println(alumnos[1]);
        System.out.println(alumnos[2]);
        System.out.println(alumnos[3]);
        System.out.println("");
        
        System.out.println("Tamaño del arreglo: " + alumnos.length);
        System.out.println("");
        */
        
        int[] notas = new int[5];
        notas[0]=93;//siempre se inicia en cero
        notas[1]=41;
        notas[2]=56;
        notas[3]=63;
        notas[4]=64;
        //notas[5]=5;// Error, fuera de límites
       /*
        for(int nota : notas){
            System.out.println(nota);
        }
        */
        /*
        for(int i = 0; i < notas.length; i++){
            int nota = notas[i];
            System.out.println("Arreglo en " + i + ": " + notas[i]);
        }
        */
        
        
        
        
        System.out.println("\nCon for-each");        
        String[] clases = {"IPC", "INTER 1", "ESTADISTICA", "QUIMICA"};
        for(String clase : clases){
            System.out.println(clase);
        }
                
    }
}
