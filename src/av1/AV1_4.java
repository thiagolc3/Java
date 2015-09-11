/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av1;
import java.util.Scanner;
/**
 *
 * @author lsfo
 */
public class AV1_4 {

    static Estoque estoque = new Estoque();
    static Scanner tecla = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int op;
        do{
            System.out.println("\n\n***** Menu Principal *****");
            System.out.println("1-Inserir novo produto");
            System.out.println("2-Retirar produtos do estoque");
            System.out.println("3-Repor produtos no estoque");
            System.out.println("4-Listar produtos do estoque");
            System.out.println("5-Listar produtos em falta no estoque");
            System.out.println("6-Calcular valor do estoque");
            System.out.println("7-Sair");
            
            System.out.print("\nDigite a opção desejada: ");
            op = tecla.nextInt();
 //           System.out.println('\n');
            
            switch(op){
                case 1: novoProduto(); break;
                case 2: retirarProduto(); break;
                case 3: reporProduto(); break;    
                case 4: listarProduto(); break;
                case 5: faltaProduto(); break;
                case 6: valorProduto(); break;
                case 7: break;
            }
        } while(op!=7);
    }
    
    private static void novoProduto(){
        System.out.print("\nInsira o código do novo produto (0-9): ");
        int cod = tecla.nextInt();
        System.out.print("Insira o nome: ");
        String nome = tecla.next();
        System.out.print("Insira o preço do produto: ");
        int preco = tecla.nextInt();
        System.out.print("Insira a quantidade: ");
        int qty = tecla.nextInt(); 
        
        estoque.novoProduto(nome, preco, qty, cod);
    }
    
    private static void retirarProduto(){
        System.out.print("\nInsira o código do produto (0-9): ");
        int cod = tecla.nextInt();
        System.out.print("Insira a quantidade: ");
        int qty = tecla.nextInt(); 
        
        estoque.retirarProduto(cod, qty);
    }
    
    private static void reporProduto(){
        System.out.print("\nInsira o código do produto (0-9): ");
        int cod = tecla.nextInt();
        System.out.print("Insira a quantidade: ");
        int qty = tecla.nextInt();
        
        estoque.reporProduto(cod, qty);
    }
    
    private static void listarProduto(){
        estoque.listaEstoque();
    }
    
    private static void faltaProduto(){
        estoque.verificaEstoque();
    }
    
    private static void valorProduto(){
        estoque.valorEstoque();
    }
}
