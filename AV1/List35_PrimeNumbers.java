package AV1;

import java.util.Scanner;
public class List35_PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele é primo ou não OBS: Inteiro");
        int number = scanner.nextInt();

        if (VerificaNumero(number)) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

    }

    public static boolean VerificaNumero(int number) {

        if (number <= 1 ) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static class List37_EntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 12 e 20: ");
            numero = scanner.nextInt();

            if (numero < 12 || numero > 20) {
                System.out.println("Entrada inválida. Tente novamente.");
            }

                } while (numero < 12 || numero > 20);

                System.out.println("Número digitado: " + numero);

                scanner.close();
            }

    }
}
