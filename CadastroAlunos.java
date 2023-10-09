package medianotas;

import java.util.Scanner;

public class CadastroAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao cadastro de alunos!");

        // Vamos criar um array para armazenar os dados dos alunos
        int quantidadeAlunos = 5; // Você pode ajustar isso conforme necessário
        String[] nomes = new String[quantidadeAlunos];
        String[] matriculas = new String[quantidadeAlunos];

        // Loop para coletar informações de alunos
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.println("Digite a matrícula do aluno " + (i + 1) + ": ");
            matriculas[i] = scanner.nextLine();
        }

        // Exibindo os dados dos alunos
        System.out.println("Lista de alunos cadastrados:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Matrícula: " + matriculas[i]);
        }

        // Feche o Scanner quando não for mais necessário
        scanner.close();
    }
}