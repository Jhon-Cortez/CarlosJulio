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
public class Tabla {
    public void tabla(){
        Scanner entrada = new Scanner(System.in);
        
        int mult;
        int num;
        
        System.out.println("Digite el numero de la tabla que desea ver:");
        num = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            mult = i * num;
            System.out.println(i + " X "+num+" = "+mult);
        }
    }
}