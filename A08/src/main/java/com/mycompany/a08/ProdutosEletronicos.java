package com.mycompany.a08;


public class ProdutosEletronicos extends Produto {
    
    private int notaFiscal;
    
    public ProdutosEletronicos(String Nome, double preco, int ID, int notaFiscal) {
        super(Nome, preco, ID);
        
        this.notaFiscal = notaFiscal;
    }
    
    public void exibirNotaFiscal(){
        System.out.println(getNotaFiscal());
    }

    public int getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

}
