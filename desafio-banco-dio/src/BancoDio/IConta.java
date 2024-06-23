package BancoDio;

public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void tranferir(double valor, Conta contaDestino);

    String extratoConta();
}
