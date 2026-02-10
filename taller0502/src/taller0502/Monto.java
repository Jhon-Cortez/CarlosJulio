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
public class Monto {
    public void calculo(){
        Scanner entrada = new Scanner(System.in);
        double monto;
        double total;
        double descuento;
        
        System.out.println("Digite el monto a compara:");
        monto = entrada.nextDouble();
        total = monto;
        if (monto>100) {
            descuento = monto * 0.1;
            total = monto - descuento;
            System.out.println("Se le hace un descuento del 10%: "+descuento);
        }
        System.out.println("El total a pagar es: "+total);
        
        
    }
    
}
