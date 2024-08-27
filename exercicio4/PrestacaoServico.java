/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author Aluno
 */
public class PrestacaoServico {
    
    private String contratoInicio;
    private String contratoFim;

    public PrestacaoServico(String contratoInicio, String contratoFim) {
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public String getContratoInicio() {
        return contratoInicio;
    }

    public String getContratoFim() {
        return contratoFim;
    }

    @Override
    public String toString() {
        return
              "\ncontratoInicio:" + contratoInicio + 
              "\ncontratoFim: " + contratoFim;
    }

    
}
