/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio6;

/**
 *
 * @author Aluno
 */
public abstract class CargoDeConfianca extends Funcionario{
    
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, String endereco, Sexo sexo, Setor setor, double salario, String dataNascimento, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        super(nome, cpf, rg, endereco, sexo, setor, salario, dataNascimento, logradouro, numero, complemento, cep, cidade, uf);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nbonificacao: " + bonificacao;
    }
    
    
    
}
