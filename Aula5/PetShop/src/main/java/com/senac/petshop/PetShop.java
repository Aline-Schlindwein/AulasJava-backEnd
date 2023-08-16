/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.senac.petshop;

/**
 *
 * @author Aluno
 */
public class PetShop {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Toby", 10);
        System.out.println("nome cachorro: " + cachorro.nome + "\n" + "idade cachorro: " + cachorro.idade);
        cachorro.interagir();

        Gato gato = new Gato("Mimi", 5);
        System.out.println("nome gato: " + gato.nome + "\n" + "idade gato: " + gato.idade);
        gato.interagir();
        
        Ave ave = new Ave("José", 3, "branca", 10);
        System.out.println("nome ave: " + ave.nome + "\n" + "idade ave: " + ave.idade + "\n" + "cor das asas: " + ave.corDasAsas + "\n" + "tamanho do bico: " + ave.tamanhoDoBico);
        ave.interagir();
    }
}
