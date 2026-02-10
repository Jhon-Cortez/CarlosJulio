/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

/**
 *
 * @author rikyf
 */
import java.util.Scanner;
public class Estudiante {
    private String nombre;
    private String curso;
    private boolean matriculado;
    private int n1;
    private int n2;
    private int n3;
    Scanner entrada = new Scanner(System.in);
    
    public void crearEstudiante(){
        System.out.println("Escriba el nombre:");
        nombre = entrada.nextLine();
        System.out.println("Escriba el curso:");
        curso = entrada.nextLine();
        System.out.println("Seleccione si esta matriculado, 1=si, 0=no");
        int op = entrada.nextInt();
        if (op == 1) {
            matriculado = true;
        }else{
            matriculado = false;
            System.out.println("Debe estar matriculado para agregarle notas");
        }
        if (matriculado == true) {
            System.out.println("Digite la nota 1:");
            n1 = entrada.nextInt();
            System.out.println("Digite la nota 2:");
            n2 = entrada.nextInt();
            System.out.println("Digite la nota 4:");
            n3 = entrada.nextInt();
            calificar();
        }
    }
    public double promedio(){
        double prom = (n1+n2+n3)/3;
        return prom;
    }
    public void calificar(){
        int ap = 60;
        
        if (promedio()>60) {
            System.out.println("El estudiante "+nombre+" del curso "+curso+" APRUEBA");
        }else{
            System.out.println("El estudiante "+nombre+" del curso "+curso+" DESAPRUEBA");
        }
        System.out.println("Su promedio es: "+promedio());
    }
}
