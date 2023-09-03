/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio14 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int a = 0; // valor que ingresa el usuario mediante el teclado
        System.out.println("Ingrese un numero de la semana (1-7) : ");
        a = scanner.nextInt();
       
        switch (a){
            case 1 :
                System.out.println("Lunes");
                break;
            case 2 :
                System.out.println("Martes");
                 break;
            case 3 :
                System.out.println("Miercoles"); 
                 break;
            case 4 :
                System.out.println("Jueves"); 
                 break;    
            case 5 :
                System.out.println("Viernes"); 
                 break;
            case 6 :
                System.out.println("Sabado"); 
                 break;
            case 7 :
                System.out.println("Domingo"); 
                 break; 
            default :
                System.out.println("Incorrecto"); 
                 break;     
        }
        scanner.close();
       
    
    
    
    }
    
}
