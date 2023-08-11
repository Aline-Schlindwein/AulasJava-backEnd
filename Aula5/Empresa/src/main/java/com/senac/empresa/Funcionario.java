/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.empresa;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    public String nome;
    public LocalDate dataNascimento;
    public double salario;
    
    public double calcularSalarioTotal(){
        return this.salario;
    }
}
