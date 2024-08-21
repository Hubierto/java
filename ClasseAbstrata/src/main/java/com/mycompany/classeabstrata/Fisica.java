/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeabstrata;

/**
 *
 * @author Aluno
 */
public class Fisica extends pessoa{
    
    String cpf;
    String rg;
    String dataNascimeno;

    public Fisica(String cpf, String rg, String dataNascimeno) {
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimeno = dataNascimeno;
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

    public String getDataNascimeno() {
        return dataNascimeno;
    }

    public void setDataNascimeno(String dataNascimeno) {
        this.dataNascimeno = dataNascimeno;
    }

    @Override
    public String toString() {
        return "Fisica{" + "cpf=" + cpf + ", rg=" + rg + ", dataNascimeno=" + dataNascimeno + '}';
    }
    
    
}
