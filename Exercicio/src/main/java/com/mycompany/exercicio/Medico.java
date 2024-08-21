/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio;

/**
 *
 * @author Aluno
 */
public class Medico extends Fun{
    
    private String crn;

    public Medico(String crn, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crn = crn;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    @Override
    public String toString() {
        return "Dados do Medico: " + 
               "\ncrn: " + crn;
    }   
    
    
    
}
