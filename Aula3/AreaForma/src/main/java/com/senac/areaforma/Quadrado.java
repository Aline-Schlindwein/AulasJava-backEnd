/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.areaforma;

/**
 *
 * @author Aluno
 */
public class Quadrado extends Forma {

    public int lado;

    public Quadrado(int lado) {
        this.lado = lado;

    }

    @Override
    public void calculoArea() {
        this.area = lado * lado;
        System.out.println(area);
    }
}
