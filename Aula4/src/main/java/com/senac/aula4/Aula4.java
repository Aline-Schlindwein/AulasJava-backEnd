/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.aula4;

/**
 *
 * @author Aluno
 */
public class Aula4 {
/*
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Aline", 24);
        
        pessoa.cursoAtual = "Java";
        System.out.println(pessoa.NOME);
        System.out.println(pessoa.IDADE);
        System.out.println("curso " + pessoa.cursoAtual);
    }
}
*/
    public static void main(String[] args) {
        Cachorro junior = new Cachorro("Junior " , 70);
        Cachorro meg = new Cachorro("Meg " , 20);
        Cachorro xuxa = new Cachorro("Xuxa " , 4);
         
         junior.latir();
         meg.latir();
         xuxa.latir();
    }
}