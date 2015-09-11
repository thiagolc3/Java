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
public class Conta {
    
    private double saldo;
    
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    public void setDebito(double valor){
        setSaldo(this.saldo -= valor);
    }

    public void setCredito(double valor){
        setSaldo(this.saldo += valor);
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
