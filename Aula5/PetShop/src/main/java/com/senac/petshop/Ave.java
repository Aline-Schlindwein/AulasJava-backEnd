/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.petshop;

/**
 *
 * @author Aluno
 */
public class Ave extends Animal {

    public String corDasAsas;
    public int tamanhoDoBico;

    public Ave(String nome, int idade, String corDasAsas, int tamanhoDoBico) {
        super(nome, idade);
        this.corDasAsas = corDasAsas;
        this.tamanhoDoBico = tamanhoDoBico;
    }

    @Override
    public void interagir() {
        System.out.println("Có có");
    }

    @Override
    public String getNome() {
        return this.nome;
    }

}
