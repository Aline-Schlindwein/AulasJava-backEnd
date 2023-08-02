/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.aula2;

import java.awt.Event;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula2 {
/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero do raio: ");
        double raio = scanner.nextDouble();
        
        System.out.println("Digite o numero do pi: ");
        double pi = scanner.nextDouble();
        
        double calculo = (pi*(raio*raio));
        String resultado = String.format("A area do circulo é: %.2f", calculo);
        System.out.println(resultado);
           
    }
}
*/
/*    
        public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);  
            
            System.out.println("Digite o primeiro numero inteiro: ");
            int num1 = scanner.nextInt();
        
            System.out.println("Digite o segundo numero inteiro: ");
            int num2 = scanner.nextInt(); 
            
            
            if (num1>num2) {
              System.out.println("numero maior é: " + num1);  
                
            } else {
                System.out.println("numero maior é: " + num2); 
            }                                           
    }
}
*/
           public static void main(String[] args) { 
             Scanner scanner = new Scanner(System.in);  
            
            System.out.println("Digite o primeiro numero inteiro: ");
            int num1 = scanner.nextInt();
        
            System.out.println("Digite o segundo numero inteiro: ");
            int num2 = scanner.nextInt();  
            
          
            System.out.println("escolha sua operação matematica: \n1=+ \n2=- \n3=* \n4=/ ");
               int conta = scanner.nextInt();
               switch (conta) {
                   case 1:
                       int conta1 = (num1+num2);
                         System.out.println("o resultado é: " + conta1);
                       break;
                   case 2:
                       int conta2 = (num1-num2);
                         System.out.println("o resultado é: " + conta2);
                       break;
                   case 3:
                       int conta3 = (num1*num2);
                         System.out.println("o resultado é: " + conta3);
                       break;   
                   case 4:
                       int conta4 = (num1/num2);
                         System.out.println("o resultado é: " + conta4);
                       break;      
                   default:
                    System.out.println("Operação invalida");   
               }
                    
           }
}  