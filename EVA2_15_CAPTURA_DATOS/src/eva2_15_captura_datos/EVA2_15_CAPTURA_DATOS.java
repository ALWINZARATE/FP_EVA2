/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA2_15_CAPTURA_DATOS {
    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in); 
    int tama;
    System.out.println("¿Cuantas calificaciones quiere capturar?");
    tama = captu.nextInt();
    int califas[] = new int[tama];
    for(int i = 0;  i < califas.length; i++){
        System.out.println("Calificacion #" + (i + 1) + ":");
        califas[i] = captu.nextInt();
    }   
    //lectura
     for(int i = 0;  i < califas.length; i++){
        System.out.print("[" + califas[i] + "]");
    }
     //PROMEDIO DEL GRUPO
     //SUMAR TODAS LAS CALIFICACIONES 
     int sumacalifas = 0;
     for(int i = 0;  i < califas.length; i++){
        sumacalifas = sumacalifas + califas[i];
        //sumacalifas += sumacalifas[i];
    }
        System.out.println("acumulado = " + sumacalifas);
        double promedio = sumacalifas / califas.length;
        System.out.println("Promedio: " + promedio);
  }  
}
