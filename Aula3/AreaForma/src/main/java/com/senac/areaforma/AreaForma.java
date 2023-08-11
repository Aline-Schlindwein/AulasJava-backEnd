/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.areaforma;

/**
 *
 * @author Aluno
 */
public class AreaForma {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(13.65);
        circulo.calculoArea();
        System.out.println("area do circulo: " + circulo.area);
       
        Retangulo retangulo = new Retangulo(10,6);
        retangulo.calculoArea();
        System.out.println("area do retangulo: " + retangulo.area);
    }
}
