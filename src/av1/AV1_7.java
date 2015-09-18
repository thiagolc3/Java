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
public class AV1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Banco banco1 = new Banco (1, "itaú");
        Banco banco2 = new Banco (2, "bb");
        
        ContaCompleta conta1 = banco1.criaConta("Suzana");
        ContaCompleta conta2 = banco1.criaConta("Joana");
        
        ContaCompleta conta3 = banco2.criaConta("Luis");
        ContaCompleta conta4 = banco2.criaConta("Maria");
        
        System.out.println('\n');
        conta1.printConta();
        conta2.printConta();
        conta3.printConta();
        conta4.printConta();
        
        conta1.depositar(2000);
        conta2.sacar(120);
        conta3.depositar(4000);
        conta4.sacar(50);
        
        System.out.println('\n');
        conta1.printConta();
        conta2.printConta();
        conta3.printConta();
        conta4.printConta();
    }
    
}
