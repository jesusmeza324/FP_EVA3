/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_metodos;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA3_4_METODOS {

    public static void main(String[] args) {
        
        System.out.println("Mayor de 8 y 7 = "+ buscarMayor(8, 7));
        
        System.out.println("");
        int dia2=buscarDia("diga un numero del 1-7 para determinar el dia de la semana");
                
    }
    public static int buscarMayor(int num1, int num2){
        
        if(num1>num2){
            return num1;
        }else{
            return num2;
            
        }
    }
    public static int buscarDia(String dia){
        Scanner cap = new Scanner(System.in);
        System.out.println(dia);
        int dia1;
        dia1=cap.nextInt();
        
         switch(dia1){
            case 1:
                System.out.println("lunes");
                break;//ultima instruccion 
                case 2:
                System.out.println("martes");
                break;
                case 3:
                System.out.println("miercoles");
                break;
                case 4:
                System.out.println("jueves");
                break;
                case 5:
                System.out.println("viernes");
                break;
                case 6:
                System.out.println("sabado");
                break;
                case 7:
                System.out.println("domingo");
                break;
                default:
                    System.out.println("numero no valido");
                 
                
        }return dia1;
    }
}
