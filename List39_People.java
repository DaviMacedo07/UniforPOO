import java.util.Scanner;

public class List39_People {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdPessoas;
        float mediaGrupo;
        int maiorIdade = -999999;
        int menorIdade = 9999999;
        int somaIdades = 0;

        System.out.println("Digite a quantidade de pessoas: ");
        qtdPessoas = scanner.nextInt();

        for (int inicio = 0 ; inicio < qtdPessoas; inicio++) {
            System.out.println("Digite a idade da Pessoa " + (inicio +1) + " :");
            int idade = scanner.nextInt();
            somaIdades += idade;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }
        }

        mediaGrupo = somaIdades / qtdPessoas;


        System.out.printf("A maior idade é: %d\n", maiorIdade);
        System.out.printf("A menor idade é: %d\n", menorIdade);
        System.out.printf("A média das idades é: %.2f\n", mediaGrupo);

        scanner.close();
    }
}
