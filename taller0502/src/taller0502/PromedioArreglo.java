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
public class PromedioArreglo {
    public void calculo(){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> arreglo = new ArrayList<>();
        int numero = 0;
        System.out.println("Escribe los datos de un arreglo con 10 datos");
            
        for (int i = 0; i < 10; i++) {
            numero = entrada.nextInt();
            arreglo.add(numero);
        }
        int max = arreglo.get(0);
        int min = arreglo.get(0);
        double prom = 0;
        double sumando = 0;
        for (int i = 0; i < arreglo.size(); i++) {
            if(max < arreglo.get(i)) {
                max = arreglo.get(i);  }
            if(min > arreglo.get(i)) {
                min = arreglo.get(i);  }
            System.out.println(arreglo.get(i));
            sumando = sumando + arreglo.get(i);
        }
        prom = sumando/arreglo.size();
        System.out.println("A continuacion se vera el numero mayor y el numero menor");
        System.out.println("Maximo: "+max);
        System.out.println("Minimo: "+min);
        System.out.println("El promedio es: "+prom);
        
    }
}
