
package com.mycompany.a08;

public class ProdutosAlimenticios extends Produto{

//    extends --> indica que uma classe está herdando outra, ou seja,
//    a classe ProdutoAlimenticio herda os atributos e métodos da classe Produto
    
    // Novos atributos
    private String dataValidade;
     
    
    // Método Construtor
    public ProdutosAlimenticios(String Nome, double preco, int ID, String dataValidade) {
        // super --> palavra reservada utilizada no construtor da 
        // classe derivada e acessa métodos da classe pai
        super(Nome, preco, ID);
        this.dataValidade = dataValidade;
    }
    
     @Override // -> indica que o método foi sobrescrito com novas infos
    public void mostrarDetalhes(){
        /*
        Carrega as informações do método mostrarDetalhes que está na superclasse Produto
        */
        super.mostrarDetalhes();
        System.out.println("Data de Validade: " + dataValidade);
    }
    
}
