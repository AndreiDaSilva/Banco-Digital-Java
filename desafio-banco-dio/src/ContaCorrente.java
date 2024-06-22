public class ContaCorrente extends Conta{

    public ContaCorrente(){
        super.banco;
        super.cliente;
        super.saldo;
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }

    @Override
    public void tranferir(double valor, Conta conta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tranferir'");
    }
    
}
