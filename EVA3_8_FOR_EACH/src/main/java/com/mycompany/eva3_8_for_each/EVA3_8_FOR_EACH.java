/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_for_each;

/**
 *
 * @author jesus
 */
public class EVA3_8_FOR_EACH {

    public static void main(String[] args) {
        String[] dias={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
       // for (int i = 0; i < dias.length; i++) {
            //System.out.print(dias[i]+"-");
        //}
        for (String dia:dias) {
            System.out.print(dia+"-");
        }
        int[]billetes={20,50,100,200,500,1000};
        for(int billete:billetes){
            System.out.println(billete+"");
        }
    }
}
