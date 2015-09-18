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
public class ContaCompleta {
    private String nome;
    private int codigo;
    private Banco banco;
    private float saldo;

    public ContaCompleta(int codigo, String nome, float saldo, Banco banco) {
        this.nome = nome;
        this.codigo = codigo;
        this.banco = banco;
        this.saldo = saldo;
    }

    public void depositar(float valor){
        setSaldo(pegaSaldo()+valor);
    }
    
    public void sacar(float valor){
        setSaldo(pegaSaldo()-valor);
    }
    
    public void printConta(){
        System.out.println("**********************");
        System.out.println("BANCO: " + pegaBanco().pegaNomeB()+ " / " + pegaBanco().pegaCodB());
        System.out.println("código da conta: " + pegaCodigo());
        System.out.println("correntista: " + pegaNome());
        System.out.println("saldo: " + pegaSaldo());
    }

    public String pegaNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int pegaCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Banco pegaBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public float pegaSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
