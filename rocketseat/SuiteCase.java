package rocketseat;

import java.util.Scanner;

public class SuiteCase {

    public static void main(String[] args){

        String nome;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nome = scanner.nextLine();
        scanner.close();

        switch (nome){
            case "Joao":
                System.out.println("O nome é " + nome);
                break;
            
            case "Maria":
                System.out.println("O nome é " + nome);
                break;
                
            case "Pedro":
                System.out.println("O nome é " + nome);
                break;
                
            default:
                System.out.println("O nome nao foi encontrado");
        }
    }
    
}
