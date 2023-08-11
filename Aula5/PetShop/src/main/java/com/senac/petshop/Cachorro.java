/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.petshop;

/**
 *
 * @author Aluno
 */
public class Cachorro extends Animal{
    
    //metodos
    @Override
    public void interagir(){
        System.out.println("Au au");
    }   

    @Override
    public String getNome() {
        return this.nome;
    }
}
