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
public class CounterPN {
    public void counter(){
        Scanner entrada = new Scanner(System.in);
        
        int num = 0;
        int pos = 0;
        int neg = 0;
        
        System.out.println("Ingresa un numero, paras escribiendo el 0");
        do {
            System.out.println("Escriba un numero");
            num = entrada.nextInt();
            if (num >=1) {
                pos++;
            }else if(num<0){
                neg++;
            }
            
        } while ( (num != 0));
        System.out.println("Escribio "+pos+" numeros positivos y "+neg+" numeros negativos");
    }
}
