public class Cliente {
    String nome;
    Double limiteCredito = 100.0;

    public void comprar(double valorDoProduto) {
        limiteCredito -= valorDoProduto;
    }
    public void solicitarLimiteDeCredito(double valorSolicitado) {
        limiteCredito = valorSolicitado;
    }
    public Cliente(String nome) {
        this.nome = nome;
    }

}