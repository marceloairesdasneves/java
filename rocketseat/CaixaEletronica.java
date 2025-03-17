package rocketseat;

public class CaixaEletronica {
    public static void main(String[] args){
        double saldo = 1000.0;
        double saque = 1500.0;

        if (saldo >= saque) {
            saque = saldo - saque;
            System.out.println("Saque " + saque + " realizado com sucesso!");
        
        } else {
            System.out.println("Saldo insuficiente! Seu saldo atual é de: " + saldo);
        }

    }
    
}
