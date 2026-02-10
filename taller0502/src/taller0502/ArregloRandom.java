/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller0502;

/**
 *
 * @author rikyf
 */
import java.util.Scanner;
import java.util.Random;
public class ArregloRandom {
    public void randomizar(){
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[5];
        Random random = new Random();
        int num = 0;
        int jugador;
        boolean acierto = false;
        int numWin = 0;
        for (int i = 0; i < 5; i++) {
            arreglo[i] = random.nextInt(10);
        }
        System.out.println("Se ha randomizado el arreglo");
        
        System.out.println("Escribe un numero para saber si esta en el arreglo random");
        
        do {
            jugador = entrada.nextInt();
            for (int i = 0; i < 5; i++) {
                if (arreglo[i] == jugador) {
                    acierto = true;
                    numWin = arreglo[i];
                }
            }
        } while (acierto == false);
        System.out.println("Se acerto el numero "+numWin+", Ganaste");
        for (int i = 0; i < 5; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
