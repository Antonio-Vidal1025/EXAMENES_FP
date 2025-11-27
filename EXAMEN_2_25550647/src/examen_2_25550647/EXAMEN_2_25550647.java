/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package examen_2_25550647;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EXAMEN_2_25550647 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
    int opc;
    System.out.println("1. Números Primos. ");
    System.out.println("2. Números No Primos. ");
    System.out.println("3. Terminar. ");
    System.out.print("Selecciona una opción del menú: ");
    opc = captu.nextInt();

    switch (opc) {

        case 1:
            int val;
            System.out.print("Introduce tu número: ");
            val = captu.nextInt();

            for (int i = 2; i <= val; i++) {
                boolean primo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }

        case 2:
            System.out.print("Introduce tu número: ");
            int num = captu.nextInt();

            for (int i = 2; i <= num; i++) {

                boolean primo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if (!primo) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
        case 3:
            System.out.println("Adios");
            break;
    }
}
}