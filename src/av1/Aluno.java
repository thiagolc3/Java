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
public class Aluno {
    
    private String nome;
    private int matricula;
    private float av1, av2;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void printAluno(){
        System.out.println("*******************************");
        System.out.println("nome: " + getNome());
        System.out.println("matr: " + getMatricula());
        System.out.println("av1: " + getAv1() + " av2: " + getAv2() + " média: " + getMedia());

        if(getMedia()>=7)
            System.out.println("situação: aprovado");
        else
            System.out.println("situação: reprovado");
    }
    
    public float getMedia(){
        return (this.av1+this.av2)/2;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getAv1() {
        return av1;
    }

    public void setAv1(float av1) {
        this.av1 = av1;
    }

    public float getAv2() {
        return av2;
    }

    public void setAv2(float av2) {
        this.av2 = av2;
    }
}
