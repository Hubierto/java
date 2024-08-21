/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.metodotostring;

/**
 *
 * @author Aluno
 */
public enum Unidadefederativa {
    
    BAHIA("Bahia","Ba"),
    SAO_PAULO("Sao Paulo","SP"),
    RIO_DE_JANEIRO("Rio de Janeiro","RJ");
    
    private String regiao;
    private String sigla;

    private Unidadefederativa(String regiao, String sigla) {
        this.regiao = regiao;
        this.sigla = sigla;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getSigla() {
        return sigla;
    }
    
    

    
    
}
