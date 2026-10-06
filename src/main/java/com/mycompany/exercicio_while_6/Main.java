package com.mycompany.exercicio_while_6;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int n, i;
        int soma =0;
        n = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de vezes = "));
        i=0;
        while(i <= n){
            int num = Integer.parseInt(JOptionPane.showInputDialog("insira o numero "+ i));
            soma =soma+num;
            i++;
        }
        JOptionPane.showMessageDialog(null,"soma: " + soma);
    }
}
