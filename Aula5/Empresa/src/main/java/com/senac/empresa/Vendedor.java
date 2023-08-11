/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.empresa;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Funcionario{
    public double comissao;
    
    @Override
     public double calcularSalarioTotal(){
        return this.salario + comissao;
    }
    
}
