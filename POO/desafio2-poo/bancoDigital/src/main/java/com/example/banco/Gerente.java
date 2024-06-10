package main.java.com.example.banco;

import java.util.List;

/**
 * Classe que representa um gerente do banco.
 */

public class Gerente {
    private String nome;
    private String matricula;
    private Banco banco;

    public Gerente(String nome, String matricula, Banco banco) {
        this.nome = nome;
        this.matricula = matricula;
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    /**
     * Autoriza uma grande transferência entre contas.
     * @param valor Valor a ser transferido.
     * @param contaOrigem Conta de onde o valor será debitado.
     * @param contaDestino Conta de destino para onde o valor será creditado.
     */
    public void autorizarTransferencia(double valor, Conta contaOrigem, Conta contaDestino) {
        if (valor > 10000) { // Limite de transferência sem autorização
            contaOrigem.transferir(valor, contaDestino);
            System.out.println("Transferência autorizada pelo gerente " + this.nome);
        } else {
            System.out.println("Transferência não necessita de autorização do gerente.");
        }
    }

    /**
     * Adiciona um novo cliente ao banco.
     * @param cliente Cliente a ser adicionado.
     */
    public void adicionarCliente(Cliente cliente) {
        // Implementar lógica para adicionar um cliente ao banco
        System.out.println("Cliente " + cliente.getNome() + " adicionado pelo gerente " + this.nome);
    }

    /**
     * Lista todas as contas gerenciadas pelo banco.
     */
    public void listarContas() {
        List<Conta> contas = banco.getContas();
        System.out.println("Contas gerenciadas pelo banco " + banco.getNome() + ":");
        for (Conta conta : contas) {
            System.out.println("Agência: " + conta.getAgencia() + ", Número: " + conta.getNumero() + ", Saldo: " + conta.getSaldo());
        }
    }
}
