/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.senac.calcularbonus;

/**
 *
 * @author Aluno
 */
public class CalcularBonus {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.imprimirFicha();
       
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.imprimirFicha();
        
        Vendedor vendedor = new Vendedor();
        vendedor.imprimirFicha();
       
        
    }
}
