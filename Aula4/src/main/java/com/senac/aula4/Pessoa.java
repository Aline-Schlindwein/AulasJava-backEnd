/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.aula4;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    public final String NOME;
    public final int IDADE;
    public final String ESPECIE_RACA = "Humana";
    
    public String cursoAtual;
    
    public Pessoa(String nome, int idade){
        this.NOME = nome;
        this.IDADE = idade;
    }   
}
