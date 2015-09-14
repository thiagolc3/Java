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
public class Candidato {

    private String nome;
    private int numero;
    private int votos;

    public Candidato(String nome, int numero){
        this.nome=nome;
        this.numero=numero;
        this.votos=0;
    }

    public void incrementaVoto(){
        setVotos(getVotos()+1);    
    }
    
    public void print(){
        System.out.println("****************************************");
        System.out.println("número: " + getNumero());
        System.out.println("nome: " + getNome());
        System.out.println("votos: " + getVotos());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
}
