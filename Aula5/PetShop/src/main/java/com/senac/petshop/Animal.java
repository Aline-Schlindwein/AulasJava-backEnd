/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.petshop;

/**
 *
 * @author Aluno
 */
public abstract class Animal {
     //atributos
    public String nome;
    public int idade;
    public String alimentacao;
    
    public abstract void interagir();
    public abstract String getNome(); 
     
}
