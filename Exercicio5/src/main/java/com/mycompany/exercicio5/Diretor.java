/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio5;

/**
 *
 * @author Aluno
 */
public class Diretor extends Funcionario implements Contratacao{
    //Constante
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, double salarioBase, Sexo sexo, Setor setor) {
        super(nome, dataNascimento, salarioBase, sexo, setor);
    }
    

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        return salarioFinal;
     }

    @Override
    public void adimitir(Funcionario funcionario) {
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
        return super.toString() +
                "\nPREMIO: " + PREMIO;
    }
    
    
}
