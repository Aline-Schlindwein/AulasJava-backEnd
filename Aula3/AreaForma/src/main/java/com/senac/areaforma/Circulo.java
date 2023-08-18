/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.areaforma;

/**
 *
 * @author Aluno
 */
public class Circulo extends Forma {

    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calculoArea() {
        this.area = Math.PI * Math.pow(raio, 2);
        System.out.println(area);

    }
}
