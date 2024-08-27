/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author Aluno
 */
public class Fornecedor {
    
       
    private String produto;

    public Fornecedor(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return 
              "produto: " + produto;
    }
  
    
}
