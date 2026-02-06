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
public class comparadorNum {
    public void comparador(){
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Digite el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Digite el segundo numero");
        num2 = entrada.nextInt();
        
        
        if (num1 == num2) {
            System.out.println("Ambos numeros son iguales");
        }else if (num1 > num2) {
            System.out.println("El primer numero es mayor");
        }else{
            System.out.println("El segundo numero es mayor");
        }
    }
}
