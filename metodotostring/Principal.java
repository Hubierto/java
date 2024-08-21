/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodotostring;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        //Endereco endereco1 = new Endereco("nenhum", "761", "e", "177990", "Salvador", Unidadefederativa.BAHIA);
         Funcionario funcionario1 = new Funcionario(001, "alguem", "987-122-122", "1213131342345", "09090909", "01/09/199", Sexo.MASCULINO, Setor.JURIDICO, 10000, "719-78787878", "weqrwf@gmail.com",
                                    new Endereco("Nah", "123", "e", "141415", "Salvador", Unidadefederativa.BAHIA));
   
    //    System.out.println("Sexo: "+ Sexo.MASCULINO);
    
        System.out.println(funcionario1.toString());
    }
}
