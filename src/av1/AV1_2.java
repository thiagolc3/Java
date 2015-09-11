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
public class AV1_2 {

    /**
     * @param args the command line arguments
     */

    static Conta conta[] = new Conta[10];
    static Scanner tecla = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
                
        int op;
        do {                
            System.out.println("\n\n*** MENU PRINCIPAL ***");
            System.out.println("1-Nova Conta");
            System.out.println("2-Consulta Saldo");
            System.out.println("3-Saque");
            System.out.println("4-Depósito");
            System.out.println("5-Transferência");
            System.out.println("6-Excluir Conta");
            System.out.println("7-Sair");
            System.out.println("**********************");

            
            System.out.print("Digite sua opção: ");
            op = tecla.nextInt();
            System.out.print('\n');
            
            switch(op){
                case 1: incluirConta(); break;
                case 2: consultarConta(); break;
                case 3: debitarConta(); break;
                case 4: creditarConta(); break;
                case 5: transfConta(); break;
                case 6: excluirConta(); break;
                case 7: break;
            }
        } while (op!=7);
    }

    private static void incluirConta(){
        System.out.print("Insira o número da conta (0-9): ");
        int num = tecla.nextInt();
        System.out.print("Insira o saldo: ");
        double saldo = tecla.nextDouble();

        conta[num] = new Conta(saldo);
        System.out.println("\nConta criada com sucesso...");
    }
    
    private static void consultarConta(){
        System.out.print("Insira o número da conta (0-9): ");
        int num = tecla.nextInt();
        System.out.println("Saldo: "+conta[num].getSaldo());
    }
    
    private static void debitarConta(){
        System.out.print("Insira o número da conta (0-9): ");
        int num = tecla.nextInt();
        System.out.print("Insira o valor a ser retirado: ");
        double valor = tecla.nextDouble();   
 
        conta[num].setDebito(valor);
        System.out.println("\nValor retirado com sucesso...");
    }

    private static void creditarConta(){
        System.out.print("Insira o número da conta (0-9): ");
        int num = tecla.nextInt();
        System.out.print("Insira o valor a ser depositado: ");
        double valor = tecla.nextDouble();   
 
        conta[num].setCredito(valor);
        System.out.println("\nValor depositado com sucesso...");
    }
    
    private static void transfConta(){
        System.out.print("Insira o número da conta origem (0-9): ");
        int numOrig = tecla.nextInt();
        System.out.print("Insira o número da conta destino (0-9): ");
        int numDest = tecla.nextInt();
        System.out.println("Insira o valor a ser transferido:");
        double valor = tecla.nextDouble();   

        conta[numOrig].setDebito(valor);
        conta[numDest].setCredito(valor);
        System.out.println("\nValor transferido com sucesso...");
    }
    
    private static void excluirConta(){
        System.out.print("Insira o número da conta (0-9): ");
        int num = tecla.nextInt();

        conta[num]=null;
        System.out.println("Conta excluida com sucesso...");
    }
    
}

