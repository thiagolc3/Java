/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av1;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author lsfo
 */
public class Mochila {
    
    private float capMax, capAtual;
    private List<ProdutoCompleto> produtosList = new ArrayList<>();

    public Mochila(float capMax) {
        this.capMax = capMax;
        this.capAtual = 0;
    }
    
    public int adicionarMochila(ProdutoCompleto produto){
        if((produto.getPeso()+getCapAtual())<getCapMax()){
            produtosList.add(produto);
            setCapAtual(produto.getPeso()+getCapAtual());
            return 0;
        }
        return -1;
    }
    
    public int removerMochila(ProdutoCompleto produto){
        if(produtosList.remove(produto)){
            setCapAtual(getCapAtual()-produto.getPeso());
            return 0;
        }
        else
            return -1;
    }
    
    public void listarMochila(){
        float valor = 0;
        for(ProdutoCompleto p: produtosList){
            p.printProduto();
            valor += p.getPreco();
        }
        System.out.println("*********************");
        System.out.println("ítens: " + produtosList.size());
        System.out.println("valor total: " + valor);
        System.out.println("carga atual: " + getCapAtual());
        System.out.println("carga máxmia: " + getCapMax());
    }

    public float getCapMax() {
        return capMax;
    }

    public void setCapMax(float capMax) {
        this.capMax = capMax;
    }

    public float getCapAtual() {
        return capAtual;
    }

    public void setCapAtual(float capAtual) {
        this.capAtual = capAtual;
    }
}
