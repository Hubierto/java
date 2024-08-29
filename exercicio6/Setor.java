/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.exercicio6;

/**
 *
 * @author Aluno
 */
public enum Setor {
    
    ENGENHARIA("Engenharia"),
    JURIDICO("juridico"),
    RECURSOS_HUMANOS("Recursos humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");
    
    String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
