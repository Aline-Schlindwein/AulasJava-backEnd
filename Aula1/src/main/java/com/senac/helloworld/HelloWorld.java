/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.helloworld;

/**
 *
 * @author Aluno
 */
public class HelloWorld {
    public static void main(String[] args) {
        double raio = 13.65;
        double pi = 3.14;
        
        double calculo = (pi*(raio*raio));
        String resultado = String.format("A area do circulo é: %.2f", calculo);

        System.out.println(resultado);
    }
}
