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
public class AV1_3 {

    /**
     * @param args the command line arguments
     */
    
    static Candidato candidato[] = new Candidato[10];
    static Scanner tecla = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        do {                
            System.out.println("\n\n*** ELEIÇÕES ***");
            System.out.println("1-Novo Candidato");
            System.out.println("2-Votar");
            System.out.println("3-Relatório Simples");
            System.out.println("4-Relatório Completo (com porcentagem)");
            System.out.println("5-Sair");
            System.out.println("**********************");

            
            System.out.print("Digite sua opção: ");
            op = tecla.nextInt();
            System.out.print('\n');
            
            switch(op){
                case 1: adicionar(); break;
                case 2: votar(); break;
                case 3: listar(); break;
                case 4: apurar(); break;
                case 5: break;
            }
        } while (op!=5);
    }

    private static void adicionar(){
        System.out.print("Digite o nome do candidato: ");
        String nome = tecla.next();
        System.out.print("Digite o número do candidato (0-9): ");
        int num = tecla.nextInt();
        
        candidato[num] = new Candidato(nome, num);
        System.out.println("\nCandidato criado com sucesso...");
    }
    
    private static void votar(){
        System.out.print("Digite o número do candidato (0-9): ");
        int num = tecla.nextInt();
        
        while(candidato[num]==null){
            System.out.println("Candidato não cadastrado!");
            System.out.print("Digite o número do candidato (0-9): ");
            num = tecla.nextInt();
        }

        System.out.print("Candidato: " + candidato[num].getNome() + "\nConfirma? 1-sim, 2-não: ");
        int flag = tecla.nextInt();

        if(flag==1){
            candidato[num].incrementaVoto();
            System.out.println("\nVoto computado com sucesso...");
        }
        else
            System.out.println("\nVoto cancelado...");        
    }

    private static void listar(){        
        for(int i=0; i<10; i++)
            if(candidato[i]!=null)
                candidato[i].print();
    }
    
    private static void apurar(){
        int total=0;
        
        for(int i=0; i<10; i++)
            if(candidato[i]!=null)
                total+=candidato[i].getVotos();
        
        for(int i=0; i<10; i++)
            if(candidato[i]!=null){
                candidato[i].print();
                System.out.println("percentual: "+candidato[i].getVotos()*100/total+'%');
            }
    }
}
