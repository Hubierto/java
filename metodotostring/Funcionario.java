/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodotostring;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String matricula;
    private String dataDeNascimento;
    private Sexo sexo;
    private Setor setor;
    private double salario;
    private String telefone; 
    private String email;
    private Endereco endereco;

    public Funcionario(int id, String nome, String cpf, String rg, String matricula, String dataDeNascimento, Sexo sexo, Setor setor, double salario, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Dados do Funcionario: " +
               "\nid: " + id +
               "\nnome: " + nome +
               "\ncpf: " + cpf + 
               "\nrg: " + rg +
               "\nmatricula:" + matricula +
               "\ndataDeNascimento: " + dataDeNascimento +
               "\nsexo:" + sexo.getTexto() + 
               "\nsetor:" + setor.getNomeDoSetor() +
               "\nsalario:" + salario +
               "\ntelefone:" + telefone +
               "\nemail:" + email + 
               "\nendereco:" + endereco;
    }
 
    
    
}
