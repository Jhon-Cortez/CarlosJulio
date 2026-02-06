/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller0502;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Comparador2 {
    public void comparador(){
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        int n3;    
        System.out.println("Digite 3 numeros diferentes.");
        System.out.println("Digite el primer numero:");
        n1 = entrada.nextInt();
        System.out.println("Digite el segundo numero:");
        n2 = entrada.nextInt();
        System.out.println("Digite el tercer numero:");
        n3 = entrada.nextInt();
        
        if (n1 == n2 && n1 == n3) {
            System.out.println("Los 3 numeros son iguales");
        }else if (n1 > n2 && n1 > n3) {
            System.out.println("El primer numero es el mayor");
        }else if (n2 > n3 && n2 > n1) {
            System.out.println("El segundo numero es el mayor");
        }else{
            System.out.println("El terce numero es el mayor");
        }
    }
}
