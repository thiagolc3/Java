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
public class Produto {
    
    private String nome;
    private int preco;
    private int quantidade;
    private int cod;
    
    public Produto(String nome, int preco, int quantidade, int cod) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.cod = cod;
    }

    public void printProduto(){
        System.out.println("************");
        
        System.out.println(getCod());
        System.out.println(getNome());
        System.out.println(getPreco());
        System.out.println(getQuantidade());       
        
        System.out.println("************");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}