/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

import java.util.concurrent.FutureTask;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario{
    
    private String Oab;

    public Advogado(String Oab, String cpf, String rg, String matricula, Setor setor, double salario, Sexo sexo, EstadoCivil estadoCivil, String DataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, DataNascimento, nome, telefone, email, endereco);
        this.Oab = Oab;
    }

    public String getOab() {
        return Oab;
    }

    public void setOab(String Oab) {
        this.Oab = Oab;
    }

    @Override
    public String toString() {
        return
              "Oab: " + Oab;
    }
    
    
    
}
