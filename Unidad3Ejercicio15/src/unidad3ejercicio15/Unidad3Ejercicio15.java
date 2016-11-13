/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3ejercicio15;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Unidad3Ejercicio15 {
public static Scanner tc=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un Método potenciaR(a,b) que calcule la potencia de a elevado a b de forma recursiva
            Utilízalo en un programa que pida al usuario la base y el exponente de una potencia y muestre el resultado.*/
       
        /*System.out.println("Introduce la base");
            int a=tc.nextInt();
        System.out.println("Introduce el exponente");
            int b=tc.nextInt();*/
        System.out.println(potenciaR(3));
            
    }
    public static int potenciaR(int b, int p){
        
        if(b==0)   //caso base
              return 1;
           else
              return p * potenciaR(b-1);
    }
}
