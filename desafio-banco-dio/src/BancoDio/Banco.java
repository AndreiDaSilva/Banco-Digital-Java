package BancoDio;

public class Banco {
    private String nome;
    private int agencia;

    public Banco(){
        this.nome = "Coin Digital One";
        this.agencia = 1001;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    
}
