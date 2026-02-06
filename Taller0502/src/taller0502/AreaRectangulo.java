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
public class AreaRectangulo {
    public void calcular(){
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        System.out.println("Digite la base de el rectangulo");
        base = entrada.nextDouble();
        System.out.println("Digite la altura de el rectangulo");
        altura = entrada.nextDouble();
        
        System.out.println("El area del rectangulo es: "+base*altura);
        double perimetro = ((base*2)+(altura*2));
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
