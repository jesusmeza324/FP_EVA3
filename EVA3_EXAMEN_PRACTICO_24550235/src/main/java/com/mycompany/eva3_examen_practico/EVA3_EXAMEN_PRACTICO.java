/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_examen_practico;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA3_EXAMEN_PRACTICO {
    public static Scanner cap = new Scanner(System.in);
    public static int numes;
   public static  int [] califas=new int [100];
   
    public static void main(String[] args) {
        
        System.out.println("digite el numero de estudiantes:");
        numes=cap.nextInt();
         for (int i = 1; i <=numes; i++) {
             System.out.println("digite la califa del estudiante #"+i);
            califas[i]=cap.nextInt();

            }   
         sacarPromedio();
                
    }
    public static void sacarPromedio(){
  
    }
 }