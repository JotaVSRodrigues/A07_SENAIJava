package com.mycompany.a08;

import java.util.*;
import javax.swing.JOptionPane;

public class ExecLivro {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        /* criando um vetor de objetos 
        o tipo do vetor é o nome da classe de objetos que pertencerão
        ao vetor*/
        Livro[] livros = new Livro[2];
        int contador = 5;
        
        System.out.println("Kindle da Bea - Cadastro de Livros");
        
        for (int i = 0; i < livros.length; i++) {
            
            System.out.print("Titulo: ");
            String titulo = JOptionPane.showInputDialog("Titulo: ");         
            System.out.println("Autor: ");
            String autor = JOptionPane.showInputDialog("Autor: ");
            System.out.println("Ano: ");
            String Ano = JOptionPane.showInputDialog("Ano: ");
            int ano = Integer.parseInt(Ano);
                     
            livros[i] = new Livro(titulo, autor, ano);     
        }       
       
        StringBuilder listaLivros = new StringBuilder();
        
        for (int i = 0; i < livros.length; i++) {
            listaLivros.append(livros[i].toString()).append('\n');            
           // livros[i].exibirLivro();          
        }           
        
        JOptionPane.showMessageDialog(null, "Livros cadastrados: "
            + listaLivros.toString());
    }    
}