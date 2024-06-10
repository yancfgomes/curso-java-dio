package main.java.com.example.banco;

/**
 * Interface que define as operações de uma conta bancária.
 */
public interface IConta {

    /**
     * Realiza um saque na conta.
     * @param valor Valor a ser sacado.
     */
    void sacar(double valor);

    /**
     * Realiza um depósito na conta.
     * @param valor Valor a ser depositado.
     */
    void depositar(double valor);

    /**
     * Realiza uma transferência para outra conta.
     * @param valor Valor a ser transferido.
     * @param contaDestino Conta de destino para a transferência.
     */
    void transferir(double valor, Conta contaDestino);
}
