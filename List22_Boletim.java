import java.util.Scanner;

public class List22_Boletim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é a quantidade de alunos: ");
        int qtdAlunos = scanner.nextInt();
        int qtdNotas = 4;

        int[][] planilha = new int[qtdAlunos][qtdNotas];
        float media;

        for (int aluno = 0; aluno < qtdAlunos; aluno++) {
            for (int nota = 0; nota < 2; nota++) {
                System.out.printf("Insira a Av%d do aluno %d: ", nota + 1, aluno + 1);
                planilha[aluno][nota] = scanner.nextInt();
            }
        }

        for (int aluno = 0; aluno < qtdAlunos; aluno++) {
            System.out.printf("Notas do aluno %d: ", aluno + 1);
            for (int nota = 0; nota < 2; nota++) {
                System.out.printf("%d ", planilha[aluno][nota]);
            }
            media = (planilha[aluno][0] + planilha[aluno][1]) / 2.0f;
            planilha[aluno][3] = (int) media;
            System.out.printf("Média: %.2f\n", media);

            if (media >= 6) {
                System.out.printf("Média: %.2f - Aprovado\n", media);
            } else {
                System.out.printf("Insira a nota da Av3 do aluno %d: ", aluno + 1);
                planilha[aluno][2] = scanner.nextInt();

                int maiorNota = Math.max(planilha[aluno][0], planilha[aluno][1]);

                media = (maiorNota + planilha[aluno][2]) / 2.0f;
                planilha[aluno][3] = (int) media;
                System.out.printf("Nova Média com Av3: %.2f\n", media);

                if (media >= 6) {
                    System.out.printf("Aluno%d Média: %.2f - Aprovado\n", aluno + 1, media);
                } else {
                    System.out.printf("Aluno%d Média: %.2f - Reprovado\n", aluno + 1, media);
                }
            }
        }

        scanner.close();
    }
}
