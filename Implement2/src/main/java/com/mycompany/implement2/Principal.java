/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.implement2;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        divisao divisao = new divisao();
        
        System.out.println(soma.calcular(3, 4));
        System.out.println(subtracao.calcular(5, 1));
        System.out.println(multiplicacao.calcular(1, 13));
        System.out.println(divisao.calcular(9, 2));
        
     }
}
