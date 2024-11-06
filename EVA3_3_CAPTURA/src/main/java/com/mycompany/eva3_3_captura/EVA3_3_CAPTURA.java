/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA3_3_CAPTURA{
    public static void main(String[] args) {
        String nombre = capturaTexto("Introduce tu nombre:");
        String apellido = capturaTexto("Introduce tu apellido:");
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        
        int edad = capturarEdad("Introduce tu edad:");
        System.out.println("Edad: " + edad);
        
        double salario = capturarSalario("Introduce tu salario:");
        System.out.println("Salario: " + salario);
    }
    
    public static String capturaTexto(String mensaje) {
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = cap.nextLine();
        return texto;
    }
    
    public static int capturarEdad(String mensaje) {
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        int numero = cap.nextInt();
        return numero;
    }
    
    public static double capturarSalario(String mensaje) {
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        double numero2 = cap.nextDouble();
        return numero2;
    }
}