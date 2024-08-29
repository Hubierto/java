/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio6;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario extends Endereco implements SalarioFinal{
    
       
    protected String nome;
    protected String cpf;
    protected String rg;
    protected String endereco;
    protected Sexo sexo;
    protected Setor setor;
    protected double salario;
    protected String dataNascimento;

    public Funcionario(String nome, String cpf, String rg, String endereco, Sexo sexo, Setor setor, double salario, String dataNascimento, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        super(logradouro, numero, complemento, cep, cidade, uf);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public abstract double getSalarioFinal();

     
    @Override
    public String toString() {
        return "\nnome: " + nome + 
               "\ncpf: " + cpf + 
               "\nrg: " + rg + 
               "\nendereco: " + endereco + 
               "\nsexo: " + sexo + 
               "\nsetor: " + setor + 
               "\nsalario: " + salario + 
               "\ndataNascimento: " + dataNascimento;
                
    }
    
    
     
    
}
