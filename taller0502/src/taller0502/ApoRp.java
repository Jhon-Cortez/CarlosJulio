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
public class ApoRp {
    public void apRp(){
        Scanner entrada = new Scanner(System.in);
        double nota;
        System.out.println("Digite su nota:");
        nota = entrada.nextDouble();
        
        if (nota >= 60) {
            System.out.println("El estudiante aprobo");
        }else{
            System.out.println("El estudiante reprobo");
        }
        
    }
}
