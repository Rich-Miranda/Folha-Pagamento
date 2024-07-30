/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.folhapagamento;

/**
 *
 * @author ricardo.lspassos
 */
public class Biblioteca {
    
    public static int gerarInteiro(int faixa){
        return (int) (Math.random()*faixa)+1;
    }
    
    public static double gerarReal(int faixa){
        return (Math.random()*faixa)+1;        
    }
    
    public static double arrendondar(double numero){
        int parteInt = (int) (numero);
        double parteDec = numero - parteInt;
        int parteDecInt = (int) (parteDec*100);
        
        if(parteDecInt%10>=5)
            parteDecInt = parteDecInt+1;
         
        return parteInt + (parteDecInt/100.);
    }
    
    
}
