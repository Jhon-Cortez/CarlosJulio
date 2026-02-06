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
public class ConversionMon {
    public void cocnvertidor(){
        double doll;
        double conv;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite una cantidad de dolares");
        doll = entrada.nextDouble();
        
        conv = doll * 0.92;
        
        System.out.println(doll+" dolares son: "+conv + " euros");
        
        
        
    }
}
