/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.folhapagamento;

/**
 *
 * @author ricardo.lspassos
 */
public abstract class Funcionario implements IDesconto{
    
    protected String nome;
    protected int matricula;
    protected double salario;
    protected char tipo;
    protected double desconto;
    protected double salarioLiq;

    public Funcionario(String nome, int matricula,char tipo) {
        this.nome = nome;
        this.matricula = matricula;
        this.tipo = tipo;
    }
    
    public Funcionario() {}
    
    public abstract void calcularSalario();
    
    public void calcularDesconto() {
        desconto = salario * TAXA;
    }
    
    public void calcularSalarioLiq() {
        calcularSalario();
        calcularDesconto();
        salarioLiq = salario - desconto;
    }
    
    public void mostrarHolerite() {
        System.out.println("Matricula:"+matricula+"\tnome:"+nome+"\tsalario:"+salarioLiq+"\ttipo:"+tipo);
    }
    
}
