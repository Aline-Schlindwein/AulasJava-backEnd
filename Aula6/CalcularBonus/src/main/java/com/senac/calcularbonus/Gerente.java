/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.calcularbonus;

/**
 *
 * @author Aluno
 */
public class Gerente extends Funcionario {

    @Override
    public void imprimirSalario() {
        this.salario = 2250;
        System.out.println(salario);
    }

    @Override
    public void imprimirFicha() {
        this.id = 01;
        this.nome = "João";
        this.salario = 2250;
        System.out.println("Id: " + this.id + " Nome: " + this.nome + " Salario: " + this.salario);
    }
}
