package AV1;

import java.util.Scanner;

public class List36_Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor principal: ");
        int valorPrincipal = scanner.nextInt();

        System.out.println("Digite o valor inicial do intervalo: ");
        int valorInicial = scanner.nextInt();

        System.out.println("Digite o valor final do intervalo: ");
        int valorFinal = scanner.nextInt();

        if (valorPrincipal >= valorInicial && valorPrincipal <= valorFinal) {
            System.out.println("O número está no intervalo de: " + valorInicial + " e " + valorFinal);
        } else {
            System.out.println("Não está no intervalo de: " + valorInicial + " e " + valorFinal);
        }

    }
}
