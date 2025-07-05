package com.mycompany.a08;

public class Main {

    public static void main(String[] args) {
        /*Instanciando o objeto
        Instanciar é a mesma coisa que criar, chamar o objeto*/
        Produto produto1 = new Produto("Projetor",3500.00,10025);
       // Produto produto2 = new Produto("Monitor", 1200.00,10026);      
                
        /* Chamando/executando um método para o objeto */
        produto1.mostrarDetalhes();
      //  produto2.mostrarDetalhes();  
        
        /* Utilizando getters e setters*/
        produto1.setPreco(4200);
        produto1.mostrarDetalhes();
        produto1.setNome("Projetor Mais caro");
        produto1.setPreco(10);
        produto1.mostrarDetalhes();
        
        
        ProdutosEletronicos batedeira = new ProdutosEletronicos("batedeira", 1200f, 12345, 20004444);
        System.out.println(batedeira.getNotaFiscal());
    }
}
