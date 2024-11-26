/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva4_9_tic_tac_toe;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA4_9_TIC_TAC_TOE {
        static char jugador = 'x';
       static char computadora = 'o';
         static char vacio = '-';
        static char tabla[][] = new char[3][3];
        static int jugada, jugada1, jugadapc, jugadapc1,movimientos=0;
        static String ganador="";
    public static void main(String[] args) {
        inicializarTabla();
           while(ganador.equals("")){
           mostrarTabla();
           String iniciar=preguntarJugada("Escoje tu jugada fila y columna (0-1-2):");
           jugadaJugador();
           verificarJugador();
           if(!ganador.equals("")){
               System.out.println("ganaste");
               break;
           }
           if(movimientos==9){
               System.out.println("empataste");
           }
            jugadaPc();
            verificarPc();
            if(!ganador.equals("")){
                System.out.println("perdiste");
                break;
            }
            if(movimientos==9){
               System.out.println("empataste");
           }
            

            
       }
        
    }
    public static void inicializarTabla() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabla[i][j] = vacio;
            }
        }
    }
      public static void mostrarTabla() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static String preguntarJugada(String mensaje){
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
           jugada = cap.nextInt();
            jugada1 = cap.nextInt();
            return mensaje;
    }
    public static void jugadaJugador(){
        if (tabla[jugada][jugada1] == vacio) {
                tabla[jugada][jugada1] = jugador;
                movimientos++;
            } else {
                
               preguntarJugada("Escoja otra casilla");
            }
    }
    public static void jugadaPc(){
          do {
            jugadapc = (int) (Math.random() * 3);
            jugadapc1 = (int) (Math.random() * 3);
        } while (tabla[jugadapc][jugadapc1] != vacio);
        tabla[jugadapc][jugadapc1] = computadora;
        movimientos++;
        mostrarTabla();
    }
    public static void verificarJugador(){
       for (int i = 0; i < 3; i++) {
            if (tabla[i][0] == jugador && tabla[i][1] == jugador && tabla[i][2] == jugador) {
                ganador = "Jugador";  
                
            }
        }
        
        for (int i = 0; i < 3; i++) {
            if (tabla[0][i] == jugador && tabla[1][i] == jugador && tabla[2][i] == jugador) {
                ganador = "Jugador";  
                
            }
        }
        
        if (tabla[0][0] == jugador && tabla[1][1] == jugador && tabla[2][2] == jugador) {
            ganador = "Jugador";  
            
        }
        if (tabla[0][2] == jugador && tabla[1][1] == jugador && tabla[2][0] == jugador) {
            ganador = "Jugador";  
            
        }
           
    }
    public static void verificarPc(){
        for (int i = 0; i < 3; i++) {
            if (tabla[i][0] == computadora && tabla[i][1] == computadora && tabla[i][2] == computadora) {
                ganador = "Computadora";  
                
            }
        }
        
        for (int i = 0; i < 3; i++) {
            if (tabla[0][i] == computadora && tabla[1][i] == computadora && tabla[2][i] == computadora) {
                ganador = "Computadora";  
                
            }
        }
        
        if (tabla[0][0] == computadora && tabla[1][1] == computadora && tabla[2][2] == computadora) {
            ganador = "Computadora";  
            
        }
        if (tabla[0][2] == computadora && tabla[1][1] == computadora && tabla[2][0] == computadora) {
            ganador = "Computadora";  
            
        }
    }
    
    
    
}
