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
public class T2_Operaciones {

    public static void main(String[] args) {
        //Concatenacion (signo más)
        String presentacion = "Mi nombre es: ";
        String nombre = "Ingrid";
        System.out.println(presentacion + nombre);
        System.out.println("Hola " + nombre + ", mucho gusto!");
        System.out.println("");
        
        //Aritmeticas
        int n1 = 9;
        int n2 = 3;

        /*operaciones*/
        int suma = n1 + n2;
        int resta = n1 - n2;
        int mult = n1 * n2;
        int div = n1 / n2;
        int mod = n1 % n2; //resto de la división
        int mod2 = 5 % 2;
        System.out.println("Aritmeticas");
        System.out.println(n1 + " + " + n2 + " = " + suma);
        System.out.println(n1 + " - " + n2 + " = " + resta);
        System.out.println(n1 + " * " + n2 + " = " + mult);
        System.out.println(n1 + " / " + n2 + " = " + div);
        System.out.println(n1 + " % " + n2 + " = " + mod);
        System.out.println(5 + " % " + 2 + " = " + mod2);
        System.out.println("");

        /*Relacionales*/
        System.out.println("Relacionales");
        System.out.println("¿3>8? " + (3>8));
        System.out.println("¿3<8? " + (3<8));
        System.out.println("¿3>=8? " + (3>=8));
        System.out.println("¿3<=8? " + (3<=8));
        System.out.println("¿3==8? " + (3==8));
        System.out.println("¿3!=8? " + (3!=8));
        System.out.println("");
        
        /*logicas*/
        System.out.println("Logicas");
        boolean es_jueves = true;
        boolean hay_lab_extra = true;
        boolean hay_feriado = false;
        
        boolean hay_clase = es_jueves || hay_lab_extra; //o
        boolean descanso = !hay_clase; //no
        System.out.println("¿Hay clase? " + hay_clase );
        System.out.println("¿Hay descanso? " + descanso );
        
        hay_clase = es_jueves && !hay_feriado;
        System.out.println("¿Hay clase? " + hay_clase);
        
        System.out.println("");
        
        //Aumento y decremento
        System.out.println("++ y --");
        System.out.println("x------------");
        int x = 4;
        x++; //x = x + 1
        System.out.println(x);
        
        System.out.println("y------------");
        int y = 9;
        y--; // y = y - 1
        System.out.println(y);
        
        System.out.println("z------------");
        int z = 55;
        System.out.println(z++);
        /*
        System.out.println(z);
        z = z + 1;
        */
        System.out.println(z);
    }
}
