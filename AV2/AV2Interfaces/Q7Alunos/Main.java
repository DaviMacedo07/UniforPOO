package AV2.AV2Interfaces.Q7Alunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        Scanner scanner = new Scanner(System.in);
        //Aqui eu coloquei 3 pelo mesmo motivo
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a matrícula do aluno " + (i + 1) + ": ");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite o IRA do aluno " + (i + 1) + ": ");
            double ira = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Digite o curso do aluno " + (i + 1) + ": ");
            String curso = scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nome, ira, curso);
            cadastro.addALunos(aluno);
            System.out.println();
        }

        cadastro.imprimirAlunos();
    }
}
