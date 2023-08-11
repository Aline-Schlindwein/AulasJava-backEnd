/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.senac.aula3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula3 {

    /*
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        for(int i=10; i<=50; i++){
        if (i %2 == 0){
            System.out.println("i = " +i);
        }
    }
   }
}
     */
 /*    
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int y = 1; y <= i; y++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite: ");
        String valor = scanner.next();

        valor = new StringBuilder(valor).reverse().toString();
        System.out.println(valor);
    }
}

    