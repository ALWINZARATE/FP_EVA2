/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

/**
 *
 * @author zarat
 */
public class EVA2_10_FOR {

    public static void main(String[] args) {
      for(int i = 1; i <= 20; i++)
          System.out.print(i + " - ");
      //IMPRIMIR AL REVES (20 AL 1)
      System.out.println("");
      for(int i = 20; i >= 1; i--)
          System.out.print(i + " - ");
      //IMPRIMIR LOS PARES DE 0 A 100
      //0 - 2 - 4 - 6 - 8 ... 98 - 100
      //+=, -=, *=, /=
      System.out.println("");
        for(int i = 0; i >= 100;i+=2)
             System.out.print(i + " - ");
        //IMPRIMIR EN ORDEN INVERSO
        System.out.println("");
         for(int i = 100; i >= 0;i-=2)
             System.out.print(i + " - ");
    }
    
}
