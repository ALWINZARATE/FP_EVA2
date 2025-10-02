/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //SWITCH --> OPCION MULTIPLE
     Scanner captu = new Scanner (System.in);
     int dia;
     System.out.println("Dia de la semana (1-7)");
     dia = captu.nextInt();
     /*if(dia == 1){
        System.out.println("Lunes");
     }else if(dia == 2){
         System.out.println("martes")
     */
     switch(dia){//OPCIONES --> CASOS
         case 1:
            System.out.println("Lunes");
            break;//fin de caso en el switch
         case 2:
            System.out.println("Martes");
            break;//fin de caso en el switch
         case 3:
            System.out.println("Miercoles");
            break;//fin de caso en el switch
         case 4:
            System.out.println("Jueves");
            break;//fin de caso en el switch
         case 5:
            System.out.println("Viernes");
            break;//fin de caso en el switch
         case 6:
            System.out.println("Sabado");
            break;//fin de caso en el switch
         case 7:
            System.out.println("Domingo");
            break;//fin de caso en el switch
         default: //OPCIONAL, SIEMPRE AL FINAL, NO NESESITA BREAK
             System.out.println("INCORRECTO");
     }
    }
    
}
