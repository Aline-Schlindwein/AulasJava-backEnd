/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.calcularbonus;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Funcionario {

    public double bonus;
    public double salarioFinal;

    @Override
    public void imprimirSalario() {
        this.salario = 2250;
        this.bonus = 300;
        this.salarioFinal = (salario + bonus);
        System.out.println("salario: " + salario);
        System.out.println("Salario com o Bonus: " + salarioFinal);
        
    }

    @Override
    public void imprimirFicha() {
        this.id = 03;
        this.nome = "André";
        this.salario = 2250;
        this.bonus = 300;
        System.out.println("Id: " + this.id + " Nome: " + this.nome + " Salario: " + this.salario + " Bonus: " + this.bonus);
    }

}
