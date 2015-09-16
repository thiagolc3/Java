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
public class AV1_5 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner tecla = new Scanner(System.in);
    static List <Aluno> aluno = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int op;
        do{
            System.out.println("\n\n***** Menu Principal *****");
            System.out.println("1-Novo aluno");
            System.out.println("2-Inserir/Editar nota");
            System.out.println("3-Situação acadêmica do aluno");
            System.out.println("4-Situação acadêmica da turma");
            System.out.println("5-Excluir matrícula");
            System.out.println("6-Sair");
            
            System.out.print("\nDigite a opção desejada: ");
            op = tecla.nextInt();
            
            switch(op){
                case 1: novoAluno(); break;
                case 2: inserirNota(); break;
                case 3: sitAluno(); break;    
                case 4: sitTurma(); break;
                case 5: delMatric(); break;
                case 6: break;
            }
        } while(op!=6);
    }
    
    public static void novoAluno(){
        System.out.print("\nInsira a matícula: ");
        int matr = tecla.nextInt();
        System.out.print("Insira o nome: ");
        String nome = tecla.next();
        
        aluno.add(new Aluno(nome, matr));
    }
    
    public static void inserirNota(){
        System.out.print("\nInsira a matícula: ");
        int matr = tecla.nextInt();
        System.out.print("Insira a nota da av1: ");
        int av1 = tecla.nextInt();
        System.out.print("Insira a nota da av2: ");
        int av2 = tecla.nextInt();
        
        for (Aluno a: aluno) {
            if(a.getMatricula()==matr){
                a.setAv1(av1);
                a.setAv2(av2);
                System.out.print("ok...");
                break;
            }
        }
    }
    
    public static void sitAluno(){
        System.out.print("\nInsira a matícula: ");
        int matr = tecla.nextInt();
       
        for (Aluno a: aluno) {
            if(a.getMatricula()==matr){
                a.printAluno();
                break;
            }
        }
    }
    
    public static void sitTurma(){
        System.out.println('\n');
        
        for (Aluno a: aluno) {
            a.printAluno();
        }
    }
    
    public static void delMatric(){
        System.out.print("\nInsira a matícula: ");
        int matr = tecla.nextInt();
       
        for (Aluno a: aluno) {
            if(a.getMatricula()==matr){
                aluno.remove(a);
                break;
            }
        }
    }
}
