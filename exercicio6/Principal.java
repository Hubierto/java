/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio6;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
       
         
         Diretor diretor = new Diretor(Bonificacao.DIRETOR, "André", "89800907706", "142355", "rua1-a", Sexo.MASCULINO, Setor.MARKETING, 1500, "21/07/2000", "nenhum ", "001 ", "A", "4145", "Salvador", UnidadeFederativa.BAHIA);
    
         System.out.println(diretor);
        
         System.out.println(diretor.bonificacao.valor);
    }
    
}
