/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lsfo
 */
public class AV1_6 {

    static Scanner tecla = new Scanner(System.in);
    static List<ProdutoCompleto> produtos = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        produtos.add(new ProdutoCompleto(1, 10, 9));
        produtos.add(new ProdutoCompleto(2, 15, 1));
        produtos.add(new ProdutoCompleto(3, 7, 13));
        produtos.add(new ProdutoCompleto(4, 9, 19));
        produtos.add(new ProdutoCompleto(5, 25, 10));

        listarProdutos();
        
        System.out.print("\nInsira a carga máxima da mochila: ");
        float carga = tecla.nextFloat();
        
        Mochila bag = new Mochila(carga);
        
        int op;
        do{
            System.out.println("\n\n***** Menu Principal *****");
            System.out.println("1-Colocar produto na mochila");
            System.out.println("2-Retirar produto da mochila");
            System.out.println("3-Detalhar mochila");
            System.out.println("4-Listar ítens cadastrados");
            System.out.println("5-Sair");
            
            System.out.print("\nDigite a opção desejada: ");
            op = tecla.nextInt();
            
            switch(op){
                case 1: inserirMochila(bag); break;
                case 2: retirarMochila(bag); break;
                case 3: detalharMochila(bag); break;    
                case 4: listarProdutos(); break;
                case 5: break;
            }
        } while(op!=5);
    }
    
    public static void inserirMochila(Mochila bag){
        System.out.print("\nInsira a código do produto: ");
        int cod = tecla.nextInt();
        
        for(ProdutoCompleto p: produtos)
            if(p.getCod()==cod)
                if(bag.adicionarMochila(p)==0)
                    System.out.println("ok...");
                else
                    System.out.println("mochila cheia!");
    }
    
    public static void retirarMochila(Mochila bag){
        System.out.print("\nInsira a código do produto: ");
        int cod = tecla.nextInt();
        
        for(ProdutoCompleto p: produtos)
            if(p.getCod()==cod)
                if(bag.removerMochila(p)==0)
                    System.out.println("ok...");
                else
                    System.out.println("o produto não está na mochila!");
    }
    
    public static void detalharMochila(Mochila bag){
        bag.listarMochila();
    }
    
    public static void listarProdutos(){
        System.out.println("Produtos pré cadastrados:");
        for(ProdutoCompleto p: produtos)
            p.printProduto();
    }
    
}
