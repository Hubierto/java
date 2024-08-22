/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3;

import java.sql.ClientInfoStatus;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        
  
     
       Cliente primeiroCliente = new Cliente("Nenhum", Sexo.MSCULINO, EstadoCivil.CASADO, "09/09/1999", "Rogerio", "719-87980906", "a@gmail.com",                                 new Endereco("a1", "16", "E", "123.456", "Salvador", UnidadeFederativa.BAHIA));
       
        System.out.println(primeiroCliente.toString());
                
                
                
    }
}
