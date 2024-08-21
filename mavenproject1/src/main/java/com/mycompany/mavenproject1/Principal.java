/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        
        Juridica pessoaJuridica = new Juridica("j8wer8j", "ugfnertu", "tfts", "fdfwwef");
        
        Fisica pessoaFisica = new Fisica("fwy7", "khgr0", "ew8ty", "8ugher7h", "98f89f");
        
        System.out.println(pessoaFisica.toString());
        System.out.println(pessoaJuridica.toString());
        
        
    }
}
