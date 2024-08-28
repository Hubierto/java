/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.implement;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        Gato gato = new Gato();
        Pato pato = new Pato();
        Galo galo = new Galo();
        
        System.out.println(toto.emitirSom() + "\n" + toto.comer() + "\n");
        System.out.println(gato.emitirSom() + "\n" + gato.comer() + "\n");
         System.out.println(pato.emitirSom() + "\n" + pato.comer() + "\n");
         System.out.println(galo.emitirSom() + "\n" + galo.comer() + "\n");
     }
}
