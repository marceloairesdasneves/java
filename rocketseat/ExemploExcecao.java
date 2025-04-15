import java.text.NumberFormat;
import java.text.ParseException;
public class ExemploExcecao {
    public static void main(String[] args){
        // Exemplo de exceção
        // NumberFormatException
        try {
            Number valor = NumberFormat.getInstance().parse("1.75");
            Double valorDouble = valor.doubleValue();
            System.out.println("Valor convertido: " + valorDouble);
        } catch (ParseException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao converter o número: " + ex.getMessage());
        }
    }
}