/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av1;

/**
 *
 * @author lsfo
 */
public class Estoque {
    
    static Produto produto[] = new Produto[10];

    public void novoProduto(String nome, int preco, int qty, int cod){
            produto[cod] = new Produto(nome, preco, qty, cod);
    }
    
    public void valorEstoque(){
        int total=0;

        for(int i=0; i<10; i++){
            if(produto[i]!=null){
                total+=produto[i].getQuantidade()*produto[i].getPreco();
            }
        }

        System.out.println("\nValor total do estoque: "+ total);
    }
    
    public void listaEstoque(){
        System.out.println("\nlista de produtos cadastrados:");
        
        for(int i=0; i<10; i++){
            if(produto[i]!=null)
                produto[i].printProduto();
        }    
    }
    
    public void verificaEstoque(){
        System.out.println("\nlista de produtos em falta:");
        
        for(int i=0; i<10; i++){
            if(produto[i]!=null)
                if(produto[i].getQuantidade()==0)
                    produto[i].printProduto();
        }
    }
    
    public void retirarProduto(int cod, int qty){
        if(produto[cod].getQuantidade()>=qty){
            produto[cod].setQuantidade(produto[cod].getQuantidade()-qty);
            System.out.println("\nok...");
        }
        else
            System.out.println("\nquantidade não disponível...");
    }
    
    public void reporProduto(int cod, int qty){
        produto[cod].setQuantidade(produto[cod].getQuantidade()+qty);
        System.out.println("\nok...");
    }
}