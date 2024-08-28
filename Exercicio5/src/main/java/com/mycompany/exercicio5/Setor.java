/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.exercicio5;

/**
 *
 * @author Aluno
 */
public enum Setor {
    
    RECURSOS_HUMANOS(""),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operações");
    
    String area;

    private Setor(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }
    
    
    
    
}
