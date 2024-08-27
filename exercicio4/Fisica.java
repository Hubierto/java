/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa{
    
    protected Sexo sexo;
    protected EstadoCivil estadoCivil;
    protected String DataNascimento;

    public Fisica(Sexo sexo, EstadoCivil estadoCivil, String DataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.DataNascimento = DataNascimento;
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

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    //@Override
    //public String toString() {
    //   return "Fisica{" + "sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", DataNascimento=" + DataNascimento + '}';
    //}
   
    
    
}
