public class Sistema{
    public static void main(String[] args){
        Cliente cliente = new Cliente("Lucas");
        System.out.println(cliente.nome);
        System.out.println(cliente.limiteCredito);
        cliente.solicitarLimiteDeCredito(200.0);
        System.out.printf("O limite de crédito de %s foi alterado para %.2f%n", cliente.nome, cliente.limiteCredito);

        cliente.comprar(50.0);
        System.out.println(cliente.limiteCredito);
        System.out.printf("O limite de crédito de %s foi alterado para %.2f%n", cliente.nome, cliente.limiteCredito);


        Cliente cliente2 = new Cliente("Maria");
        System.out.println(cliente2.nome);
        System.out.println(cliente2.limiteCredito);
        cliente2.solicitarLimiteDeCredito(80.0);
        System.out.printf("O limite de crédito de %s foi alterado para %.2f%n", cliente2.nome, cliente2.limiteCredito);
        cliente2.comprar(22.0);
        System.out.println(cliente2.limiteCredito);
        System.out.printf("O limite de crédito de %s foi alterado para %.2f%n", cliente2.nome, cliente2.limiteCredito);



    }



}