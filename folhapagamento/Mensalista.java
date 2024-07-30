/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.folhapagamento;

/**
 *
 * @author ricardo.lspassos
 */
public class Mensalista extends Funcionario{
    private double salarioMensal;

    public Mensalista(String nome, int matricula,double salarioMensal) {
        super(nome, matricula,'M');
        this.salarioMensal = salarioMensal;
    }
    
    public void calcularSalario(){
        salario = salarioMensal;
    }
}
