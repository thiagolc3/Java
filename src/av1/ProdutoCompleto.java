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
public class ProdutoCompleto {
    private int cod;
    private float preco;
    private float peso;

    public ProdutoCompleto(int cod, float preco, float peso) {
        this.cod = cod;
        this.preco = preco;
        this.peso = peso;
    }

    public void printProduto(){
        System.out.println("****************");
        System.out.println("código: " + getCod());
        System.out.println("preço: " + getPreco());
        System.out.println("peso: " + getPeso());
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
