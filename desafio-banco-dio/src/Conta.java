public abstract class Conta implements IConta{
    protected Banco banco;
    protected Cliente cliente;
    protected double saldo; 
    
    public Conta(String nome){
        this.banco = new Banco();
        this.saldo = 0.0;
        this.cliente = new Cliente(nome);
    }
}