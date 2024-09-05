import java.util.Scanner;

public class List45_Height_Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] vetorIdade = new int[5];
        double [] vetorAltura = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite a Idade da pessoa %d: ", i+1);
            vetorIdade[i] = scanner.nextInt();
            System.out.printf("Digite a altura da pessoa %d (em metros): ", i+1);
            vetorAltura[i] = scanner.nextDouble();
        }

        System.out.println("Impressão dos vetores na ordem Inversa");

        for (int i = 4; i >= 0; i--) {
            System.out.printf("Pessoa %d - Idade: %d anos, Altura: %.2f metros\n", i + 1, vetorIdade[i], vetorAltura[i]);

        }

    }
}
