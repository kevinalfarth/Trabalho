/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho;

import javax.swing.JFrame;


public class Principal {
    public static void main(String[] args) {
        JFrame Trabalho = new JFrame("Trabalho");
        Trabalho t = new Trabalho();
        
        //Definir atributos de tela
        Trabalho.setDefaultCloseOperation(Trabalho.EXIT_ON_CLOSE);
        Trabalho.setSize(600, 400);
        Trabalho.add(t);
        Trabalho.setVisible(true);
    }
}
