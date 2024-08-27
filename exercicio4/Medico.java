/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author Aluno
 */
public class Medico extends Funcionario{
    
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, Sexo sexo, EstadoCivil estadoCivil, String DataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, DataNascimento, nome, telefone, email, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
     
    @Override
    public String toString() {
        return
              "crm: " + crm;
    }
    
    
    
}
