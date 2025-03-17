package rocketseat;

import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {

        System.out.println("Resultado escolar");
        double nota1, nota2, nota3, nota4;
        double media;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a 1 nota: ");
        nota1 = scanner.nextDouble(); // Changed to nextDouble() to accept decimal values
        System.out.println("Digite a 2 nota: ");
        nota2 = scanner.nextDouble(); // Corrected variable name
        System.out.println("Digite a 3 nota: ");
        nota3 = scanner.nextDouble(); // Corrected variable name
        System.out.println("Digite a 4 nota: ");
        nota4 = scanner.nextDouble(); // Corrected variable name
        scanner.close();

        media = (nota1 + nota2 + nota3 + nota4) / 4; // Calculate the average

        // Using the ternary operator to determine the result
        String resultado = media >= 7 ? "Aprovado" : media >= 5 ? "Recuperação" : "Reprovado";
        System.out.println("Sua média foi: " + media);
        System.out.println("Resultado: " + resultado);
    }
}
