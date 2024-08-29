/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio6;

/**
 *
 * @author Aluno
 */
public class Motorista extends Funcionario{
    
    private String carteiraDehabilitacao;

    public Motorista(String carteiraDehabilitacao, String nome, String cpf, String rg, String endereco, Sexo sexo, Setor setor, double salario, String dataNascimento, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        super(nome, cpf, rg, endereco, sexo, setor, salario, dataNascimento, logradouro, numero, complemento, cep, cidade, uf);
        this.carteiraDehabilitacao = carteiraDehabilitacao;
    }

    public String getCarteiraDehabilitacao() {
        return carteiraDehabilitacao;
    }

    public void setCarteiraDehabilitacao(String carteiraDehabilitacao) {
        this.carteiraDehabilitacao = carteiraDehabilitacao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncarteiraDehabilitacao: " + carteiraDehabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return super.salario;

    }
    
    
    
}
