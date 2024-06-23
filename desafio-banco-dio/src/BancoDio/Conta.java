package BancoDio;

import java.util.Random;

public abstract class Conta implements IConta {
    private static int proximaConta = 1000;
    private Banco banco;
    private Cliente cliente;
    private int numero;
    private double saldo;
    private TipoConta tipoConta;

    public Conta(String nome, TipoConta tipoConta) {
        this.tipoConta = tipoConta;
        this.cliente = new Cliente(nome);
        this.banco = new Banco();
        this.numero = proximaConta;
        this.saldo = 0.0;
        proximaConta++;
    }

    @Override
    public String extratoConta() {
        String msg = "=== EXTRATO DA CONTA " + getTipoConta() + " ===\n";
        msg += String.format("Agencia %d \n", getBanco().getAgencia());
        msg += String.format("Numero da Conta %d \n", getNumero());
        msg += String.format("Saldo %.2f \n", getSaldo());
        msg += "Cliente: " + cliente.getNome();

        return msg;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new NullPointerException("Valor maior que saldo. Saldo disponivel = R$" + getSaldo());
        }
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    /**
     * @return the banco
     */
    public Banco getBanco() {
        return banco;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return the tipoConta
     */
    public TipoConta getTipoConta() {
        return tipoConta;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    
}