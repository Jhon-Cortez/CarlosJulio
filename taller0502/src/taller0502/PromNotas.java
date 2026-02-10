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
public class PromNotas {
    public void promedio(){
        Scanner entrada = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        
        double prom;
        
        System.out.println("Digite la nota 1");
        n1 = entrada.nextDouble();
        System.out.println("Digite la nota 2");
        n2 = entrada.nextDouble();
        System.out.println("Digite la nota 3");
        n3 = entrada.nextDouble();
        
        prom = (n1+n2+n3)/3;
        
        System.out.println("El promedio de las tres notas es: "+prom);
    }
    
}
