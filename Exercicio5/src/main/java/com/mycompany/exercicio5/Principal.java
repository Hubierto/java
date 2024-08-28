/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio5;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("00001", "André", "21/01/2002", 2000, Sexo.MASCULINO, Setor.OPERACOES);
        Diretor diretor = new Diretor("Homer", "20/9/2000", 5000, Sexo.MASCULINO, Setor.RECURSOS_HUMANOS);
        
        System.out.println(motoboy);
        System.out.println(diretor);
        
        //Uso do método de acesso apenas ao diretor
        diretor.demitir(motoboy);
        
            }
}
