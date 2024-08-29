/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio6;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
    
    private final double PREMIO = 0.5;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, String endereco, Sexo sexo, Setor setor, double salario, String dataNascimento, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        super(bonificacao, nome, cpf, rg, endereco, sexo, setor, salario, dataNascimento, logradouro, numero, complemento, cep, cidade, uf);
    }
    
       @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salario * PREMIO + super.salario * bonificacao.valor;
        salarioFinal += super.salario;
        return salarioFinal;
     }
    

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("=== Admitindo funcionario ===");
        System.out.println("Dados do funcionário");
        System.out.println(funcionario.toString());
     }
    

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("=== Demitindo funcionario ===");
        System.out.println("Dados do funcionário");
        System.out.println(funcionario.toString());
     }
     

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n\nSalário do diretor: "+ getSalarioFinal() +
                "\nPREMIO: " + PREMIO;
              
    }
    

  

  
}
