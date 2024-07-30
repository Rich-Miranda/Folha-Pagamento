/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.folhapagamento;

/**
 *
 * @author ricardo.lspassos
 */
public class FolhaPagamento {

    public static void main(String[] args) {
        Horista oH = new Horista("Donald", 313,90.7,140);
        oH.calcularSalarioLiq();
        
        Horista oH1 = new Horista("Gansolino", 9002,17.90,140);
        oH1.calcularSalarioLiq();
         
        Mensalista oT = new Mensalista("Gastao", 1313,12900);
        oT.calcularSalarioLiq();

        Mensalista oT1 = new Mensalista("Peninha", 456,7900);
        oT1.calcularSalarioLiq();
        
        Mensalista oT2 = new Mensalista("Huguinhi", 12333,1300);
        oT2.calcularSalarioLiq();
        
        Funcionario []empresa = new Funcionario[5];
        empresa[0] = oH;
        empresa[1] = oT;
        empresa[2] = oH1;
        empresa[3] = oT1;
        empresa[4] = oT2;
        
        for(int i=0;i<empresa.length;i++)
            empresa[i].mostrarHolerite();
        
    }
}
