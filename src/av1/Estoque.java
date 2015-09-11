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
}