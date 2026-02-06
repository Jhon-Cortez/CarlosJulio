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

public class Pago {
    public void calculo(){
        Scanner entrada = new Scanner(System.in);
        double horas;
        double pagoH;
        
        System.out.println("Digite la cantidad de horas trabajadas:");
        horas = entrada.nextDouble();
        System.out.println("Digite el pago por hora trabajada en dolares");
        pagoH = entrada.nextDouble();
        System.out.println("El pago por trabajar "+horas+" hora(s) es: "+pagoH*horas);
        
    }
}
