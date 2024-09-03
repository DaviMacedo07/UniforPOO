import java.util.Random;
import java.util.Scanner;

// . Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a
//média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.

public class List43_Boletim {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int qtdAlunos = 10, qtdNotas = 4;
        double[] medias = new double[qtdAlunos];
        int alunosAprovados = 0;
        int[][] boletim = new int[qtdAlunos][qtdNotas];

        for (int i = 0; i < qtdAlunos; i++ ) {
            for (int j = 0; j < qtdNotas; j++) {
                System.out.printf("Digite a nota Av%d do aluno %d: \n", j + 1, i + 1);
                boletim[i][j] = random.nextInt(11);
            };
        }

        for (int i = 0; i < qtdAlunos; i++) {
            int somaNotas = 0;
            for (int j = 0; j < qtdNotas; j++) {
                somaNotas += boletim[i][j];
            }
            medias[i] = somaNotas / (double) qtdNotas;
            if (medias[i] >= 7.0) {
                alunosAprovados++;
            }
        }

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.printf("Notas do aluno %d: ", i + 1);
            for (int j = 0; j < qtdNotas; j++) {
                System.out.printf("%d ", boletim[i][j]);
            }
            System.out.printf(" | Média: %.2f\n", medias[i]);
        }

        System.out.println("Alunos Aprovados : "  + alunosAprovados);
    }
}
