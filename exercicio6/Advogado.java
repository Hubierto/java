/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio6;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario{
    
    private String oab;

    public Advogado(String oab, String nome, String cpf, String rg, String endereco, Sexo sexo, Setor setor, double salario, String dataNascimento, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        super(nome, cpf, rg, endereco, sexo, setor, salario, dataNascimento, logradouro, numero, complemento, cep, cidade, uf);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\noab: " + oab;
    }

    @Override
    public double getSalarioFinal() {
        return super.salario;
     }
    
    
    
}
