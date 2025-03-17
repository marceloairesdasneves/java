package rocketseat;

import java.util.Scanner;

public class ExemploFor {

    public static void main(String[] args){
        String alunos[] = new String[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Digite o nome do aluno: ");
            alunos[i] = scanner.nextLine();
        }
        /* 
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Aluno: " + i + " - "  + alunos[i]);
        }
        */
        for(String aluno : alunos){
            System.out.println("Aluno: " + aluno);
        }
        scanner.close();
    }
}
