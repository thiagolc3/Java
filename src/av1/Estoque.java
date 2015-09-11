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

    public void novoProduto(int cod, String nome, int preco, int qty){
            produto[cod] = new Produto(nome, preco, qty);
    }
    
    public int valorEstoque(){

        int total=0;

        for(int i=0; i<10; i++){
            if(produto[i]!=null){
                total+=produto[i].getQuantidade()*produto[i].getQuantidade();
            }
        }

        return total;
    }
}