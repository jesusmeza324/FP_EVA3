/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_examen_2da;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA3_5_EXAMEN_2DA {

    static final int PIEDRA = 1;
    static final int PAPEL = 2;
    static final int TIJERA = 3;
    static final int EMPATE = 0;
    static final int GANA = 1;
    static final int PIERDE = 4;

    public static void main(String[] args) {
        int resu, jugada;
        
        do {
            resu = pedirJugada("Introduce tu jugada (1-Piedra, 2-Papel, 3-Tijera, 0-Salir):");
            
            if (resu == 0) {
                System.out.println("¡Gracias por jugar!");
                break;
            }
            
            jugada = generarJugada();
            System.out.println("computadora: " + jugada);
            
            int resultado = evaluarPartida(resu, jugada);
            
            if (resultado == EMPATE) {
                System.out.println("empate");
            } else if (resultado == GANA) {
                System.out.println("ganaste");
            } else if (resultado == PIERDE) {
                System.out.println("perdiste");
            }
        } while (resu != 0);
    }

   
    public static int pedirJugada(String mensaje) {
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        int seleccion = cap.nextInt();
        
        // Validación para asegurar que la entrada es válida
        while (seleccion < 0 || seleccion > 3) {
            System.out.println("Entrada no válida. Por favor, introduce un número entre 0 y 3:");
            seleccion = cap.nextInt();
        }
        
        return seleccion;
    }

    
    public static int generarJugada() {
        int jugada;
        double valor = Math.random();
        
        if (valor >= 0 && valor < 0.3) {
            jugada = PIEDRA;
        } else if (valor >= 0.3 && valor < 0.6) {
            jugada = PAPEL;
        } else {
            jugada = TIJERA;
        }
        
        return jugada;
    }

    
    public static int evaluarPartida(int jugadaUsu, int jugadaComp) {
        int resu;
        
        if (jugadaUsu == PIEDRA && jugadaComp == PIEDRA) {
            resu = EMPATE;
        } else if (jugadaUsu == PIEDRA && jugadaComp == PAPEL) {
            resu = PIERDE;
        } else if (jugadaUsu == PIEDRA && jugadaComp == TIJERA) {
            resu = GANA;
        } else if (jugadaUsu == PAPEL && jugadaComp == PIEDRA) {
            resu = GANA;
        } else if (jugadaUsu == PAPEL && jugadaComp == PAPEL) {
            resu = EMPATE;
        } else if (jugadaUsu == PAPEL && jugadaComp == TIJERA) {
            resu = PIERDE;
        } else if (jugadaUsu == TIJERA && jugadaComp == PIEDRA) {
            resu = PIERDE;
        } else if (jugadaUsu == TIJERA && jugadaComp == PAPEL) {
            resu = GANA;
        } else if (jugadaUsu == TIJERA && jugadaComp == TIJERA) {
            resu = EMPATE;
        } else {
            resu = EMPATE; 
        }
        
        return resu;
    }
}
  

