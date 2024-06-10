package main.java.com.example.banco;

/**
 * Classe que representa uma conta corrente.
 */
public class ContaCorrente extends Conta {

    /**
     * Imprime o extrato da conta corrente.
     */
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Corrente");
        super.imprimirInfosComuns();
    }
}
