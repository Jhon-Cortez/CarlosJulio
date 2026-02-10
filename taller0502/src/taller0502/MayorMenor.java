/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller0502;

/**
 *
 * @author rikyf
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class MayorMenor {
    public void calculo(){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> arreglo = new ArrayList<>();
        int numero = 0;
        System.out.println("Escribe los datos que tendra el arreglo, cuando se escriba -1 el arreglo acabara");
        do {
            numero = entrada.nextInt();
            if (numero != -1) {
                arreglo.add(numero);
            }
        } while (numero != -1);
        
        int max = arreglo.get(0);
        int min = arreglo.get(0);
        for (int i = 0; i < arreglo.size(); i++) {
            if(max < arreglo.get(i)) {
                max = arreglo.get(i);  }
            if(min > arreglo.get(i)) {
                min = arreglo.get(i);  }
            System.out.println(arreglo.get(i));
        }
        
        System.out.println("A continuacion se vera el numero mayor y el numero menor");
        System.out.println("Maximo: "+max);
        System.out.println("Minimo: "+min);
    }
}
