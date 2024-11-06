/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_return;

/**
 *
 * @author jesus
 */
public class EVA3_2_RETURN {

    public static void main(String[] args) {
        //llamar al metodo
        //si regresa resultados tenemos dos opciones
        //hacer algo con el valor
        //guardarlo y usarlo varias veces
        int valor;
        valor=sumarDosEnteros(100, 50);
        System.out.println("Resultado="+valor);
        //usarlo una sola vez
        System.out.println("Resultado="+sumarDosEnteros(100, 50));
        //ignorar el valor
        sumarDosEnteros(100, 50);
    }
    //Sumar dos enteros
    public static int sumarDosEnteros (int num1, int num2 ){
        int resu;
        resu=num1+num2;
        return resu;
        
    }
}
