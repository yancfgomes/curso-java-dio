package main.java.com.example.banco;

/**
 * Classe que representa uma conta poupança.
 */
public class ContaPoupanca extends Conta {

    /**
     * Imprime o extrato da conta poupança.
     */
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Poupança");
        super.imprimirInfosComuns();
    }
}
