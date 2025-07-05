package com.mycompany.a08;

public class Livro {
    /* atributos da classe */
    private String Titulo;
    private String Autor;
    private int Ano;
    
    /* método construtor: todos os livros criados terão os mesmos
    atributos */
    public Livro(String titulo, String autor, int ano) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.Ano = ano;
    }
   
    
    @Override
    public String toString() {
        return "Título: " + Titulo + ", Autor: " + Autor + ", Ano: " 
                + Ano;
    }
    
    /* método para exibir dados de cada livro*/
    public void exibirLivro(){
        System.out.println("---------------------------------");
        System.out.println("Titulo: " + Titulo + " | " + "Autor: " + 
        Autor + " | " + "Ano: " + Ano);
    }
    
    
    
    
    
}
