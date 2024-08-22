/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa{
    
    protected Sexo sexo;
    protected EstadoCivil estadoCivil;
    protected String dataNascimentoString;

    public Fisica(Sexo sexo, EstadoCivil estadoCivil, String dataNascimentoString, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNascimentoString = dataNascimentoString;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimentoString() {
        return dataNascimentoString;
    }

    public void setDataNascimentoString(String dataNascimentoString) {
        this.dataNascimentoString = dataNascimentoString;
    }

    @Override
    public String toString() {
        return  
                super.toString() +
                "\nsexo: " + sexo +
                "\nestadoCivil: " + estadoCivil +
                "\ndataNascimentoString: " + dataNascimentoString;
    }
    
    
    
}
