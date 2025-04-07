//Guess player's number
import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
        int tentativas = 0;
        int chute = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (chute != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            chute = scanner.nextInt();
            tentativas++;

            if (chute < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (chute > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}