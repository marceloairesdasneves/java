package rocketseat;

import java.util.Date;

public class OperadoresLogicos {
    public static void main(String[] args) {

        String concatenacao;
        concatenacao = 1 + "1";
        concatenacao = "1" + 1;
        concatenacao = 1 + 1 + "1";
        concatenacao = 1 + "1" + 1;
        concatenacao = "1" + 1 + 1;
        concatenacao = "1" + (1 + 1);
        concatenacao = (1 + 1) + "1" + (1 + 1);
        System.out.println(concatenacao);

    }
}