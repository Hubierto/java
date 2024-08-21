/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.metodotostring;

/**
 *
 * @author Aluno
 */
public enum Setor {
    
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico");
    
    String nomeDoSetor;

    private Setor(String nomeDoSetor) {
        this.nomeDoSetor = nomeDoSetor;
    }

    public String getNomeDoSetor() {
        return nomeDoSetor;
    }
    
    
}
