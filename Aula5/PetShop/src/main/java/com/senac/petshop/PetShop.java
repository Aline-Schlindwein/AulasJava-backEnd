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
       Cachorro cachorro = new Cachorro();
       cachorro.nome = "Toby";
       cachorro.interagir();
       
       Gato gato = new Gato();
       gato.interagir();
    }
}
