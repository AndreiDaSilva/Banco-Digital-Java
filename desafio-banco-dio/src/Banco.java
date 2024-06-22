public class Banco {
    private int agencia;
    private String nome;

    public Banco(){
        this.agencia = 1001;
        this.nome = "Cash Digital One";
    }

    public int getAgencia(){
        return agencia;
    }

    public String getNome(){
        return nome;
    }
}
