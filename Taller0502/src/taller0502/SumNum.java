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
public class SumNum {
    public void sumNum(){
        Scanner entrada = new Scanner(System.in);
        
        int n;
        int sum = 0;
        
        System.out.println("Digite hasta que numero quiere sumar:");
        n = entrada.nextInt();
        
        for (int i = 1; i <= n; i++) {
            sum = sum+i;
        }
        System.out.println("La suma es: "+sum);
    }
}
