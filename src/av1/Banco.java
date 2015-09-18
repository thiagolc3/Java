/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lsfo
 */
public class Banco {
    
    private String nome;
    private int codigo;
    private List<ContaCompleta> contas = new ArrayList<>();

    public Banco(int codigo, String nome) {
        this.nome = nome;
        this.codigo = codigo;
    }
    
    public ContaCompleta criaConta(String nome){
        
        ContaCompleta tempConta =  new ContaCompleta(contas.size(), nome, 1000, this);
        
        if(contas.add(tempConta))
            return tempConta;
        else
            return null;
    }
    
    public ContaCompleta buscaConta(int cod){
        for(ContaCompleta c: contas){
            if(c.pegaCodigo() == cod){
                return c;
            }
        }
        return null;
    }

    public String pegaNomeB() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int pegaCodB() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
