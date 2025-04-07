package rocketseat;
import java.util.*;
//import java.util.Scanner;

public class CriarUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usuarios = new ArrayList<>();
        int opcao;

        do {
            System.out.println("==== Menu ====");
            System.out.println("1. Adicionar Usuário");
            System.out.println("2. Listar Usuários");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();
                    usuarios.add(nome);
                    System.out.println("Usuário adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("=== Lista de Usuários ===");
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {
                        for (int i = 0; i < usuarios.size(); i++) {
                            System.out.println((i + 1) + ". " + usuarios.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo... Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}