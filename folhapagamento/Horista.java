package com.mycompany.folhapagamento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ricardo.lspassos
 */
public class Horista extends Funcionario{
    private double vlHora;
    private double qtHora;

    public Horista(String nome, int matricula,double vlHora, double qtHora) {
        super(nome, matricula,'H');
        this.vlHora = vlHora;
        this.qtHora = qtHora;
    }

    
    public double getVlHora() {
        return vlHora;
    }

    public void setVlHora(double vlHora) {
        this.vlHora = vlHora;
    }

    public double getQtHora() {
        return qtHora;
    }

    public void setQtHora(double qtHora) {
        this.qtHora = qtHora;
    }
    
    
    
    public void calcularSalario(){
        salario=qtHora*vlHora;
    }
    
}
