package rocketseat;
import java.util.Random;

public class DoWhileTeste {
    public static void main(String[] args) {
        System.out.println("Discando");

        do {
            System.out.println("Tocando o telefone...");
        } while (tocando());
        Random random = new Random();
        if (random.nextInt(10) <= 5) {
            System.out.println("Alô... Quem é?");
        } else {
            System.out.println("Não foi possível completar a ligação");
            
        }

    }

    private static boolean tocando() {
        final Random random = new Random();
        return random.nextInt(5) != 0;
    }
}
