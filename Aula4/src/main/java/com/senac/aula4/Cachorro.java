/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.aula4;

/**
 *
 * @author Aluno
 */
public class Cachorro {
    public String nome;
    public int tamanho;
    
    public Cachorro(String nome, int tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }
    
    public void latir(){
        if (this.tamanho > 60){
            System.out.println(this.nome +  " Woof Woof!");            
        }else if (this.tamanho > 14){
            System.out.println(this.nome + " Ruff Ruff!");   
        } else {
            System.out.println(this.nome + " Yip Yip!"); 
        }
    }
    
   public int pegarTamanho(){
       return this.tamanho;
   }
}
