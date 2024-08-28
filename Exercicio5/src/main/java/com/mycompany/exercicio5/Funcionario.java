/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio5;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario {
    
    protected String nome;
    protected String dataNascimento;
    protected double salarioBase;
    protected Sexo sexo;
    protected Setor setor;

    public Funcionario(String nome, String dataNascimento, double salarioBase, Sexo sexo, Setor setor) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salarioBase = salarioBase;
        this.sexo = sexo;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
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
    
    //A implementaçao não é obrigatoria
    public abstract double getSalarioFinal();
    
    @Override
    public String toString() {
        return "\nnome: " + nome + 
               "\ndataNascimento: " + dataNascimento + 
               "\nsalarioBase: " + salarioBase + 
               "\nsexo: " + sexo.getTexto() + 
               "\nsetor: " + setor.getArea() +
               "\nSalario base: " + salarioBase +
               "\nSalario final: "+ getSalarioFinal();
    }
 
     
    
    
    
}
