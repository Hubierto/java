/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author Aluno
 */
public class Engenheiro extends Funcionario{
    
    private String crea;

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, Sexo sexo, EstadoCivil estadoCivil, String DataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, DataNascimento, nome, telefone, email, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

   

    @Override
    public String toString() {
        return "crea: " + crea;
    }

  
 
 
    
    
    
}
