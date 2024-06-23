import BancoDio.Conta;
import BancoDio.ContaCorrente;
import BancoDio.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
      ContaCorrente cc = new ContaCorrente("Andrei Robson da Silva");
      ContaPoupanca cp = new ContaPoupanca("Tanaeli Edna Bumgartem");

      cc.depositar(1000.00);
      cc.tranferir(500, cp);
      System.out.println(cc.extratoConta());
      System.out.println(cp.extratoConta());
      //cc.sacar(1500);
      //System.out.println(cc.extratoConta());

    }
}
