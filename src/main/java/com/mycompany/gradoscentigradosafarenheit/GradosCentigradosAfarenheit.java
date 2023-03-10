/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradoscentigradosafarenheit;

import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class GradosCentigradosAfarenheit {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double temperatura,F;
        System.out.println("ingrese la temperatura en grados centigrados:");
        temperatura=leer.nextInt();
        F = 32 + (9 * temperatura / 5);
        System.out.print("la temperaturta en Fº es: " + F);
    
    }
}
