
package com.mycompany.a08;

public class Produto {
    /*Atributos da classe*/
    private String Nome;
    private double Preco;   
    private int ID;
    
    /*Método construtor -> função que padroniza a criação de objetos,
    além de garantir que os atributos (privados) possam ser acessados
    de forma segura por outras classes*/
    /*este é um método com parâmetros e sem retorno*/
    public Produto(String Nome, double preco, int ID) {
        this.Nome = Nome;
        this.Preco = preco;
        this.ID = ID;
    }   
    
    /*Getters e Setters -> ENCAPSULAMENTO
    Getters -> "pegam" as informações de um atributo e definem que é
    um atributo de leitura
    Setters -> modificam as informações de um atributo e definem que é
    um atributo de escrita
    Quero APENAS acessar o atributo -> somente get
    Quero APENAS modificar o atributo -> somente set
    Quero acessar E modificar o tributo -> get e set
    */

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    /*função com retorno e sem parâmetro*/
    public double getPreco() {
        return Preco;
    }
    
    /*funcao sem retorno e com parâmetro*/
    public void setPreco(double Preco) {
        if (Preco > 0){
            this.Preco = Preco;
        } else {
            System.out.println("Preco invalido");
        }       
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
    
    /*Método que exibe as infos. dos produtos*/
    /*void -> representa que o método não possui retorno, ou seja,
    o retorno é vazio*/
    public void mostrarDetalhes(){
        System.out.println("Produto: " + Nome);
        System.out.println("Preco: " + Preco);
        System.out.println("ID: " + ID);
    } 
    
    
    
    
    
    
    
    
    
}
