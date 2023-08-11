/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.empresa;

import java.time.LocalDate;
import jdk.nashorn.internal.parser.Scanner;

/**
 *
 * @author Aluno
 */
public class Empresa {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.nome = "Marcos";
        gerente.salario = 4500;
        gerente.dataNascimento = LocalDate.now();
        
        double salarioGerente = gerente.calcularSalarioTotal();
        System.out.println("Salario gerente: " + salarioGerente);
        System.out.println("Nome gerente: " + gerente.nome);
        System.out.println("Data nascimento gerente: " + gerente.dataNascimento);
        
        
        Vendedor vendedor = new Vendedor();
        vendedor.nome = "Jose";
        vendedor.salario = 2500;
        vendedor.dataNascimento = LocalDate.now();
        vendedor.comissao = 300;
   
        double salarioVendedor = vendedor.calcularSalarioTotal();
        System.out.println("Salario vendedor: " + salarioVendedor);
        System.out.println("Nome vendedor: " + vendedor.nome);
        System.out.println("Data nascimento vendedor: " + vendedor.dataNascimento);
    }
}
